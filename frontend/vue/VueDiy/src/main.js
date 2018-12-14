import Vue from 'vue'
import App from './App.vue'
import router from './router'
import Axios from 'axios'
import './main.less'

Axios.defaults.baseURL = 'http://localhost:8888/'
Vue.prototype.$axios = Axios

router.beforeEach(function(to,from,next){
    if(!to.meta.isChecked){
        next();
    }
    else{
        if(window.localStorage.getItem('userName')){
            next()
        }else{
            alert('请先登录')
            next({name:'login'})
        }
    }

})

new Vue({
    el:'#app',
    router,
    render:c=>c(App)
    // components:{
    //     app:App
    // },
    // template:'<app/>'
})