import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)

const state = {
  num: 30
}
const mutations = {
  addNum (state, payload) {
    state.num += payload.num
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
