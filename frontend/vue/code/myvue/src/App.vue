<template>
  <div>
    <mt-header :title="pageTitle">
      <router-link to="/" slot="left">
        <mt-button icon="back">返回</mt-button>
      </router-link>
    </mt-header>
    <router-view v-on:getChildTitle=showTitle></router-view>
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
  </div>
</template>
<script>
import store from '@/Vuex/store'
export default {
  data () {
    return {
      text: 'i am app',
      selected: '',
      pageTitle: ''
    }
  },
  store,
  methods: {
    changeHash () {
      this.$nextTick(function () {
        this.$router.push({
          name: this.selected
        })
      })
    },
    showTitle (data) {
      this.pageTitle = data
    },
    goback () {
      this.$router.go(-1)
    }
  }
  // watch: {
  //   selected (nVal, oVal) {
  //     this.$router.push({
  //       name: nVal
  //     })
  //   }
  // }
}
</script>
