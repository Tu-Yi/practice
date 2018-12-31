// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './Vuex/store'
import Axios from 'axios'
import MintUI from 'mint-ui'
import MyUl from '@/components/common/MyUL'
import MyLi from '@/components/common/MyLi'
import MySwipe from '@/components/common/MySwipe'
import Comment from '@/components/common/Comment'
import Moment from 'moment'
import VuePreview from 'vue-preview'
import 'mint-ui/lib/style.css'
import './assets/css/global.css'
import './assets/ttf/iconfont.css'

Vue.component(MyUl.name, MyUl)
Vue.component(MyLi.name, MyLi)
Vue.component(Comment.name, Comment)
Vue.component(MySwipe.name, MySwipe)

Vue.use(MintUI)
Vue.use(VuePreview)

Vue.filter('formatDate', function (val, str) {
  if (val) {
    return Moment(val).format(str)
  }
  return '--'
})
Vue.filter('formatDate', function (val) {
  if (val) {
    return Moment(val).fromNow()
  }
  return '--'
})
Vue.filter('convertStr', (val, num) => {
  if (val && val.length > num) {
    return val.substring(0, num) + '......'
  }
  return val
})

// Axios.defaults.baseURL = 'http://118.24.175.34:8888/'
Axios.defaults.baseURL = 'http://localhost:8888/'
Vue.prototype.$axios = Axios

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

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
