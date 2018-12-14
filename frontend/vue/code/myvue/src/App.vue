<template>
  <div>
    <mt-header title="myProject">
      <router-link to="/" slot="left">
        <mt-button icon="back">返回</mt-button>
  </router-link>
    </mt-header>
    <router-view/>
    <mt-tabbar v-model="selected" fixed>
      <mt-tab-item id="home">
        <img slot="icon" src="./assets/img/home.png">
        首页
      </mt-tab-item>
      <mt-tab-item id="member">
        <img slot="icon" src="./assets/img/member.png">
        会员
      </mt-tab-item>
      <mt-tab-item id="shopcart">
        <img slot="icon" src="./assets/img/shopcart.png">
        购物车
      </mt-tab-item>
      <mt-tab-item id="search">
        <img slot="icon" src="./assets/img/search.png">
        查找
      </mt-tab-item>
  </mt-tabbar>
  </div>
</template>
<script>
export default {
  data () {
    return {
      text: 'i am app',
      selected: ''
    }
  },
  watch: {
    selected (nVal, oVal) {
      this.$router.push({
        name: nVal
      })
    }
  }
}
</script>
