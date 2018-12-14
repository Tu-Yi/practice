import Vue from 'vue'
import Router from 'vue-router'
import Login from './Login.vue'
import TodoList from './TodoList.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
        path: '/',
        redirect: {
            name:'login'
        }
    },
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
        path: '/todoList',
        name: 'todoList',
        component: TodoList,
        meta:{
            isChecked:true
        }
      }
  ]
})