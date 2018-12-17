import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)

const state = {
  routerBack: '/'
}
const mutations = {
  set (state, n) {
    this.state.routerBack = n
  }
}

export default new Vuex.Store({
  state,
  mutations
})
