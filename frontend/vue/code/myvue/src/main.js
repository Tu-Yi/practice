// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import Axios from 'axios'
import MintUI from 'mint-ui'
import MyUl from '@/components/common/MyUL'
import MyLi from '@/components/common/MyLi'
import Moment from 'moment'
import 'mint-ui/lib/style.css'
import './assets/css/global.css'
import './assets/ttf/iconfont.css'

Vue.component(MyUl.name, MyUl)
Vue.component(MyLi.name, MyLi)

Vue.use(MintUI)

Vue.filter('formatDate', function (val, str) {
  if (val) {
    return Moment(val).format(str)
  }
  return '--'
})

Axios.defaults.baseURL = 'http://localhost:8888/'
Vue.prototype.$axios = Axios

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
