<template>
  <div>
    <mt-header :title="pageTitle" ref="appHeader">
    </mt-header>
    <transition name='rv' mode="out-in">
        <router-view v-on:getChildTitle=showTitle class="tmpl" :appRefs="$refs"></router-view>
    </transition>
    <mt-tabbar v-model="selected" fixed ref="appFooter">
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
        购物车<mt-badge type="error" size="small">{{appShowNum}}</mt-badge>
      </mt-tab-item>
      <mt-tab-item id="search">
        <img @click="changeHash" slot="icon" src="./assets/img/search.png">
        查找
      </mt-tab-item>
  </mt-tabbar>
  </div>
</template>
<script>
import EventBus from './EventBus'
import GoodsTools from './GoodsTools.js'
export default {
  data () {
    return {
      text: 'i am app',
      selected: '',
      pageTitle: '',
      num: 0
    }
  },
  computed: {
    appShowNum () {
      return this.$store.getters.getNum
    }
  },
  created () {
    this.num = GoodsTools.getTotalCount()
    EventBus.$on('addShopCart', data => {
      this.num = data
    })
  },
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
<style scoped>
.rv-enter-active, .rv-leave-active{
  transition: opacity .5s;
}
.rv-enter,.rv-leave-to{
  opacity: 0;
}
</style>
