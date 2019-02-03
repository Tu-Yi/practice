# myvue

> A Vue.js project

## Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report

# run unit tests
npm run unit

# run e2e tests
npm run e2e

# run all tests
npm test
```

For a detailed explanation on how things work, check out the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).



## vue基础笔记总结

### 项目初始化

1. 安装vue脚手架   `npm i -g vue-cli`
2. 根据vue脚手架初始化项目  `vue init webpack 项目名` 
3. 安装axios、mint-ui到生产环境  `npm i axios mint-ui -S`
4. 引入并初始化axios
```javascript

main.js
import Axios from 'axios'
Axios.defaults.baseURL = 'http://localhost:8888/'
Vue.prototype.$axios = Axios
```
4. 引入并初始化mint-ui
```javascript
main.js
import MintUI from 'mint-ui'
import 'mint-ui/lib/style.css'
Vue.use(MintUI)
```
5. `Vue.use(Router)`路由的挂载默认放在了router中

6. 引入全局css 有全局的css都可以写在这里面
assets css global.css  
import './assets/css/global.css'

*PS: 关闭eslint，config-index---useEslint false*

### APP组件制作

1. header 
定义pageTitle变量和v-on:getChildTitle=showTitle，用于接收子组件传回的页面标题参数
***header前进后退的控制需要再研究***
```javascript
<mt-header :title="pageTitle">
    <router-link to="/" slot="left">
      <mt-button icon="back">返回</mt-button>
    </router-link>
</mt-header>
<router-view v-on:getChildTitle=showTitle></router-view>
showTitle (data) {
    this.pageTitle = data
}
```
2. footer
fixed: 将tabbar固定在底部，
selected： 设置每个item的id，可自动关联到selected
changeHash: 实现路由跳转
```javascript
<mt-tabbar v-model="selected" fixed>
    <mt-tab-item id="home">
      <img @click="changeHash" slot="icon" src="./assets/img/home.png">
      首页
    </mt-tab-item>
    <mt-tab-item id="member">
      <img @click="changeHash" slot="icon" src="./assets/img/member.png">
      会员
    </mt-tab-item>
    <mt-tab-item id="shopcart">
      <img @click="changeHash" slot="icon" src="./assets/img/shopcart.png">
      购物车
    </mt-tab-item>
    <mt-tab-item id="search">
      <img @click="changeHash" slot="icon" src="./assets/img/search.png">
      查找
    </mt-tab-item>
</mt-tabbar>

注意使用nextTick，防止事件延迟响应
changeHash () {
  this.$nextTick(function () {
    this.$router.push({
      name: this.selected
    })
  })
}

// 解决下方tabbarr遮挡内容
<router-view class="tmpl"></router-view>
global.css
.tmpl{
    margin-bottom: 55px;
}
```

### home组件制作

1. 轮播图
引入mt-swipe组件
注意设置轮播图高度：`.mint-swipe  height:200px`
```javascript
<mt-swipe :auto="0">
    <mt-swipe-item v-for="img in imgs" :key="img.id">
        <img :src="img.path" alt="no">
    </mt-swipe-item>
</mt-swipe>
```
2. 九宫格主页菜单
如下，创建ul/li组件，用于存放
```javascript
<my-ul>
    <my-li v-for="(grid,index) in grids" :key="index">
      <router-link :to="grid.router">
        <div :class="grid.itemClass">
            {{grid.title}}
        </div>
      </router-link>
    </my-li>
</my-ul>

main.js
import MyUl from '@/components/common/MyUL'
import MyLi from '@/components/common/MyLi'

Vue.component(MyUl.name, MyUl)
Vue.component(MyLi.name, MyLi)
```

3. 注意首页路由重定向
```javascript
{
  path: '/',
  redirect: {
    name: 'home'
  }
}
```
4. 向app组件传标题
```javascript
sendTitle () {
  this.$emit('getChildTitle', '首页')
}
```

### 新闻列表及详情组件制作

1. momentjs.com locate  定义全局过滤器 YYYY-MM-DD
![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-13/58266106.jpg)


2. 修改新闻列表每一项，router-link :to="{name: 'news.detail',query:{id:news.id}}"
```javascript
 <article>
    <section v-for="item in newsList" :key="item.id">
        <router-link :to="currentPath" @click.native="toDetail(item.id)">
            <div id="imgDiv">
                <img :src="item.path" alt="不存在">
            </div>
            <div id="contentDiv">
                <div id="titleDiv">{{item.title}}</div>
                <div id="bottomDiv">
                    <span id="click">{{item.clickCount}}</span>
                    <span id="creatTime">{{item.creatTime | formatDate('YYYY-MM-DD')}}</span>
                </div>
            </div>
        </router-link>
    </section>
</article>
```

3. 创建详情页，配置路由，构造数据，制作页面，绑定数据，导航栏

4. 新闻详情，html样式控制，golbal.css里控制img 100%
```javascript
.newsDetail img{
    width: 100%;
}
```

### 图文分享组件

1. home里创建图文分享链接
创建图文列表和路由  `/photo/list/:categoryId`
```javascript
{
  title: '图文分享',
  itemClass: 'item item_share',
  router: {name: 'photo.list', params: {categoryId: 0}}
}
```
2. 图片懒加载
每个图片加入值为图片路径的绑定属性 `v-lazy`，加入样式`image[lazy=loading] `
```javascript
<ul id="photolist">
  <li v-for="item in photoList" :key="item.id" :id="item.id">
    <img v-lazy="item.path" alt="图片不存在">
  </li>
</ul>
image[lazy=loading] {
  width: 40px;
  height: 300px;
  margin: auto;
}
```
3. 路由守卫
路由变化的时候触发：路由守卫  
beforeRouteUpdate(to,from,next)  next()，路由不变，参数改变时触发
```javascript
beforeRouteUpdate (to, from, next) {
  this.loadPhoto(to.params.categoryId)
  next()
}
```
4. 绑定分类信息，调用绑定函数，unshift添加全部节点
```javascript
<li>
  <a href="javascript:;" @click="loadPhoto(0)">全部图片</a>
</li>
```
5. 添加toast
图片使用字体图标
```javascript
if (this.photoList.length === 0) {
  this.$toast({
    message: '没有图片',
    iconClass: 'iconfont icon-danmokuai'
  })
}
```
6. 点击分类，路由需要改变
```javascript
this.$router.push({
  name: 'photo.list',
  params: {
    categoryId
  }
})
```

### 图文详情组件

1. 实现图片float排列
引入vue-preview组件
```javascript
npm i vue-preview -S
import VuePreview from 'vue-preview'
Vue.use(VuePreview)
<vue-preview :slides="photos"></vue-preview>
this.photos.forEach(element => {
  src:
  alt:
  element.msrc = element.src
  element.w = 200
  element.h = 200
})
```
2. 制作评论组件
创建和引入评论组件，引入mintui的button，父组件传入id和type，按照page绑定数据
加载更多：获取分页数据，如果为空提示没有更多数据不显示按钮
相对时间 filter fromNow（）  Moment.locale('zh-cn')
发表评论：发post请求，this.$axios.post('postComonent/'+this.cid,'content='+this.newContent)  

3. 配置全局加载效果
```javascript
引入mintui indicator,
import VuePreview from 'vue-preview'
Vue.use(VuePreview)
// 配置请求拦截器
Axios.interceptors.request.use(config => {
  MintUI.Indicator.open({
    text: '加载中'
  })
  return config
})
// 配置响应拦截器
Axios.interceptors.response.use(response => {
  MintUI.Indicator.close()
  return response
})
```

### 商品列表
创建商品列表页面，修改路由，修改home
引入loadmore：
```javascript
<mt-loadmore :auto-fill="false" :bottom-method="loadBottom" ref="loadmore" :bottom-all-loaded="isAllLoad">

// 注意设置外层div滚动条和高度，否则上拉有问题
<div style="overflow: scroll;height:590px;">或者
.container{
    position: absolute;
    left:0;
    top:-58px;
    width:100%;
    height: 100%;
    overflow:auto;
    box-sizing:border-box;
    -webkit-overflow-scrolling: touch;
    z-index:-1;
}

methods: {
  doSearch () {
    this.$axios.get('goodsList/' + this.page + '/' + this.pageSize)
      .then(res => {
        console.log(res.data)
        if (res.data.length === 0) {
          this.isAllLoad = true
        }
        if (this.page !== 1) {
          this.goodsList = this.goodsList.concat(res.data)
        } else {
          this.goodsList = res.data
        }
        console.log(this.goodsList)
      })
      .catch(err => { console.log(err) })
  },
  loadBottom () {
    console.log('上拉触发')
    this.page++
    this.doSearch()
    this.$refs.loadmore.onBottomLoaded()
  }
  // ...
}
字符串截取过滤器
Vue.filter('convertStr',(val,num)=>{
  return val.subString(0,num) + '......'
})
```
### 商品详情

创建商品详情页面，加上路由和链接，获取详情数据
创建轮播图组件，mySwip.vue，样式，接收请求url，获取数据，注册

1. 制作购物车小球，vue过渡动画，
//钩子函数
```javascript
<transition name="ball" @after-enter="afterEnter"> 
    <div class="ball" v-if="isExit"></div>
</transition>

//钩子函数
showBall () {
  this.isExit = true
},
afterEnter () {
  this.isExit = false
  GoodsTools.add({
      id: this.detail.id,
      num: this.num
  })
},

.ball-enter-active{
    animation: bounce-in 1.5s;
}
.ball-leave{
    opacity: 0;
}
@keyframes bounce-in{
    0% {
        transform: translate3d(0,0,0);
    }
    50% {
        transform: translate3d(100px,-100px,0);
    }
    75% {
        transform: translate3d(160px,0px,0);
    }
    100% {
        transform: translate3d(100px,170px,0);
    }
}
.ball{
    border-radius: 50%;
    background-color: red;
    width: 24px;
    height:24px;
    position:absolute;
    top:440px;
    left:120px;
    display: inline-block;
    z-index: 9999;
}
```
2. 向APP组件传递参数
```javscript
// APP-tabbar加入badge
购物车<mt-badge type="error" size="small">{{num}}</mt-badge>

goodsdetail制作购买数量加减，数量不能小于1

创建EventBus.js
import Vue from 'vue'
let EventBus = new Vue()
export default EventBus

APP里监听事件
EventBus.$on('addShopCart', data => {
  this.num = data
})

goodsDetail里的afterEnter发送参数，obj.getTotalCount()为localStorage里商品数量
EventBus.$emit('addShopCart', obj.getTotalCount())
```
3. 商品图文介绍
加入路由，component直接用NewsDetail
修改NewsDetail，加入beforeRouteEnter函数，根据from.name来判断来路，改变title变量的值，改变url，
```javascript
beforeRouteEnter (to,from,next) {
  let title = ''
  if (from.name == null) {
    if(to.name === 'news.detail'){
      title = '新闻详情'
    }else if (to.name === 'goods.detail.info'){
      title = '图文详情'
    }
  }else if (from.name === 'news.list') {
    title = '新闻详情'
  }else if (from.name === 'goods.detail') {
    title = '图文详情'
  }
  // 此时还没有this，所以使用vm
  next(vm => {
    vm.appTitle = title
  })
}
// created和mounted里都获取不到vm值，现在知道的只有使用watch
watch: {
  appTitle: function(){
    this.$emit('getChildTitle', this.appTitle)
  }
}
```
### 购物车

1. 新增GoodsTools.js，操作localStorage，存储加入购物车的商品ID和数量`{"1":5,"2":3}`
```javascript
import EventBus from './EventBus'
let obj = {}
obj.getGoodsList = function () {
  return JSON.parse(window.localStorage.getItem('goods') || '{}')
}
obj.saveGoods = function (goodsList) {
  window.localStorage.setItem('goods', JSON.stringify(goodsList))
  // 数据变化时传递APP参数
  EventBus.$emit('addShopCart', obj.getTotalCount())
}
obj.add = function (goods) {
  let goodsList = this.getGoodsList()
  goodsList[goods.id] = goods.num
  this.saveGoods(goodsList)
}
obj.getTotalCount = function () {
  let goodsList = this.getGoodsList()
  let values = Object.values(goodsList)
  let sum = 0
  values.forEach(val => { sum += val })
  return sum
}
export default obj
```

2. APP 里引入
```javascript
created () {
  this.num = GoodsTools.getTotalCount()
  EventBus.$on('addShopCart', data => {
    this.num = data
  })
}
```
3. goodsdetail里引入
```javascript
afterEnter () {
  this.isExit = false
  GoodsTools.add({
      id: this.detail.id,
      num: this.num
  })
}
```
4. 购物车页面
创建购物车页面，通过localStorage传入接口id获取商品信息
```javascript
let goodsList = GoodsTools.getGoodsList()
let ids = Object.keys(goodsList).join(',');
this.$axios.get('getShopCartList/' + ids)
  .then( res => {
    this.list = res.data
    this.list.forEach(element => {
      if(goodsList[element.id]){
        //element.num = goodsList[element.id]
        // define后添加的属性，需要重新set才能和vue关联
        this.$set(element,'num',goodsList[element.id])
      }
    });
  })
  .catch(err => console.log(err))
}

删除
del (index) {
  this.list.splice(index,1)
}

总价和总数量  `payment.price payment.count`
computed: {
  payment () {
    let price = 0
    let count = 0
    this.list.forEach( good => {
      count += good.num
      price += good.price * good.num
    })
    return {
      count,
      price
    }
  }
}

离开购物车  保存数据到localStorage，放行
beforeRouteLeave (to, from, next) {
  console.log(1111)
  if(confirm('do you leave?')){
    let obj = {}
    this.list.forEach( cur => {
      obj[cur.id] = cur.num
    })
    GoodsTools.saveGoods(obj)
    next()
  }else {
    next(false)
  }
}
```
### 优化

1. 页面跳转加上效果
```javascript
<transition name='rv' mode="out-in">
    <router-view v-on:getChildTitle=showTitle class="tmpl"></router-view>
</transition>
.rv-enter-active, .rv-leave-active{
  transition: opacity .5s;
}
.rv-enter,.rv-leave-to{
  opacity: 0;
}
```

2. mint-ui组件按需引入
```javascript
main.js
import spinner from 'mint-ui/lib/spinner'  
import 'mint-ui/lib/spinner/style.css'
```

3. 路由懒加载
修改router
const xx = () => import()
npm install --save-dev babel-plugin-syntax-dynamic-import
syntax-dynamic-import,放到balelrc plugins中

4. webpack优化
https://segmentfault.com/q/1010000008832754
https://webpack.docschina.org/guides/lazy-loading/

5. vuex
```javascript
import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)

const state = {
  num: 0
}
const mutations = {
  addNum (state, payload) {
    state.num += payload.num
  }
}
//可以存在异步操作，最后通知mutations改数据
const actions = {
  addNumByServer (store,playload) {
    setTimeOut(
      function(){
        store.commit('addNum',{num:playload.num})
      },1000
    )
  }
}
let getters = {
  getNum: function (state) {
    return state.num
  }
}

export default new Vuex.Store({
  state,
  getters,
  mutations
})

import store from './Vuex/store'
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})

computed: {
  appShowNum () {
    return this.$store.getters.getNum
  }
}
this.$store.commit('addNum',{num:5})
this.$store.dispatch('addNumByServer',{num:10})
```

6. history模式

![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/19-1-5/41166569.jpg)

7. 预渲染

8. 骨架屏
npm i -g lavas
lavas init 
选择包含app_shell，也包含了骨架屏
npm i

![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/19-1-5/44792853.jpg)

9. 多页应用

10. pwa

![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/19-1-5/12331247.jpg)

### 其他

1. 数据模拟服务
npm i -g json-server
创建db.json
命令行 json-server --watch ./db.json

2. 打包
npm run build
index.js build productionsourcemap false
部署到腾讯云
WINSCP

3. 总结截图
![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-27/96336771.jpg)
![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-27/94125906.jpg)
![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-27/74392162.jpg)


## 收尾










