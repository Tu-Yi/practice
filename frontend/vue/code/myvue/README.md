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



## 笔记
npm i -g vue-cli
vue init webpack ****
npm i axios mint-ui -S

导入并配置axios和mint插件
```javascript
main.js
import Axios from 'axios'
import MintUI from 'mint-ui'
import 'mint-ui/lib/style.css'

Vue.use(MintUI)

Axios.defaults.baseURL = 'https://www.sinya.online/api/'
Vue.prototype.$axios = Axios
```

router
![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-11/48613107.jpg)


**初始化引入header**
```javascript
<template>
  <div>
    <mt-header fixed title="myProject"></mt-header>
  </div>
</template>
<script>
export default {
  data () {
    return {
      text: 'i am app'
    }
  }
}
</script>
```

**制作底部菜单和路由及跳转**
引入tabbar，修改菜单图片和文字，修改selected关联的id为英文
建立4个对应菜单的入口组件页面，router中配置好路由，APP里放好router-view,APP的watch里监视selected，this.$router.push({name:newV})

关闭eslint，config-index,useEslint false

引入全局css
assets css global.css  
import './assets/css/global.css'

引入swipe
.mint-swipe  height:200px
建立对象imgs: []
home created 获取轮播图数据填充imgs
swipe，v-for绑定数据,给key
style里加上scoped

写九宫格和样式

创建ul和li组件，main。js中引入

![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-11/12432073.jpg)

![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-11/88272116.jpg)

改造home.vue，用新组件创建

首页重定向
{
  path: '/',
  redirect: {
    name: 'home'
  }
}


grid中增加router对象
router:{name: 'news.list'}
用router-link :to包裹griddiv，
配置路由news.list,创建页面，制作列表页面，构造数据，绑定数据

tabbar  fixed 固定在底部

momentjs.com locate  定义全局过滤器 YYYY-MM-DD
![](http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-13/58266106.jpg)

创建navbar
name: 'nav-bar'
this.$router.go(-1)
props: ['title']
main里引入
newslist 放入navbar,传递title

解决点击下方菜单不跳转的问题
菜单图片加点击事件changehash
this.$nextTick(function(){
  this.$router.push
})

修改新闻列表每一项，router-link :to="{name: 'news.detail',query:{id:news.id}}"
创建详情页，配置路由，构造数据，制作页面，绑定数据，导航栏

home里创建图文分享链接
params:{categoryId:0}
创建图文列表和路由
/photo/list/:categoryId
制作图文分享列表页面，绑定数据
图片懒加载
点菜单加载
路由变化的时候触发：路由守卫  beforeRouteUpdate(to,from,next)  next()，路由不变，参数改变触发
绑定分类信息，调用绑定函数，添加全部节点，添加toast，数据为空提示(找矢量图标，放入assets，main引入矢量图css，)
if(this.imgs.length)===0   this.$toast















