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
fixed: 将tabbar固定在底部，每个子组件最外层div记得`margin-bottom:50px;`
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


- 图文列表，点击分类，路由需要改变
this.$router.push({
  name: 'photo.list',
  params: {
    categoryId
  }
})
- 新闻详情，html样式控制，golbalcss里控制img 100%

- 创建图文详情页面，绑定详细信息和content，
npm i vue-preview -S
import VuePreview from 'vue-preview'
Vue.use(VuePreview)
imgs新增属性 msrc,w,h
实现图片排列

解决bottom显示不全

创建和引入评论组件，引入mintui的button，父组件传入id，route传入page，绑定数据，相对时间 filter fromNow（）  Moment.locale('zh-cn')
制作加载更多，没有数据了给toast，没有更多数据就不显示按钮
制作发表评论，发post请求，this.$axios.post('postComonent/'+this.cid,'content='+this.newContent)

引入mintui indicator,
配置请求拦截器
Axios.interceptors.request.use(config => {
  MintUI.Indicator.open({
    text: ''
  })
  return config
})
配置响应拦截器
Axios.interceptors.response.use(response => {
  MintUI.Indicator.close()
  return response
})

创建商铺列表页面，修改路由，修改home，传入id
引入loadmore，上拉下拉函数记得用this.$refs.loadmore.onTop/bottom     上拉设置autofill false
静态图片 import imgSrc from '../afa.jpg'
<div style="overflow: scroll;height:590px;">
<mt-loadmore :auto-fill="false" :bottom-method="loadBottom" ref="loadmore" :bottom-all-loaded="isAllLoad">
分页控制，没有更多数据提示

字符串截取过滤器
Vue.filter('convertStr',(val,num)=>{
  return val.subString(0,num) + '......'
})

创建商品详情页面，加上路由和链接，获取详情数据
创建轮播图组件，mySwip.vue，样式，接收请求url，获取数据，注册

制作购物车小球，vue过渡




















