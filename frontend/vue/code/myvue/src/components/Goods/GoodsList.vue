<template>
  <div class="container">
    <mt-loadmore
      :auto-fill="false"
      :bottom-method="loadBottom"
      ref="loadmore"
      :bottom-all-loaded="isAllLoad"
    >
      <div style="height:98px;"></div>
      <ul>
        <li v-for="item in goodsList" :key="item.id">
          <router-link :to="{ name: 'goods.detail', params: { id: item.id } }">
            <div class="imgDiv">
              <img :src="item.src" alt="no" />
            </div>
            <div class="titleDiv">
              {{ item.title | convertStr(20) }}
            </div>
            <div class="priceDiv">￥{{ item.price }}</div>
          </router-link>
        </li>
      </ul>
    </mt-loadmore>
  </div>
</template>
<script>
export default {
  data () {
    return {
      topStatus: '',
      goodsList: [],
      page: 1,
      pageSize: 4,
      isAllLoad: false,
      boxHeight: ''
      // ...
    }
  },
  props: ['appRefs'],
  created () {
    this.doSearch()
  },
  // mounted () {

  //   let headerHeight = this.appRefs.appHeader.$el.offsetHeight
  //   let footerHeight = this.appRefs.appFooter.$el.offsetHeight
  //   let height = document.documentElement.clientHeight - headerHeight - footerHeight
  //   this.boxHeight = 'height:' +  '100%;overflow: auto;'
  //   console.log(document.documentElement.clientHeight,headerHeight,footerHeight,this.boxHeight)
  // },
  methods: {
    doSearch () {
      this.$axios.get('goodsList/' + this.page + '/' + this.pageSize)
        .then(res => {
          console.log(res.data)
          if (res.data.length === 0) {
            this.isAllLoad = true
          }
          if (this.page !== 1) {
            this.goodsList = this.goodsList.concat(res.data)
          } else {
            this.goodsList = res.data
          }
          console.log(this.goodsList)
        })
        .catch(err => { console.log(err) })
    },
    loadBottom () {
      console.log('上拉触发')
      this.page++
      this.doSearch()
      this.$refs.loadmore.onBottomLoaded()
    }
    // ...
  }
  // ...
}
</script>
<style scoped>
.container {
  position: absolute;
  left: 0;
  top: -58px;
  width: 100%;
  height: 100%;
  overflow: auto;
  box-sizing: border-box;
  -webkit-overflow-scrolling: touch;
  z-index: -1;
}
ul {
  margin: 0;
  padding: 0;
  display: flex;
  flex-wrap: wrap;
}
li {
  list-style: none;
  width: 49%;
  border: 1px solid #333;
}
.imgDiv {
  display: flex;
  width: 100%;
  height: 180px;
  align-items: center;
  justify-content: center;
}
img {
  width: 70%;
  height: 160px;
}
.titleDiv {
  padding-left: 3px;
  padding-top: 10px;
  padding-bottom: 10px;
}
.priceDiv {
  padding-left: 3px;
  color: red;
  padding-top: 11px;
  padding-bottom: 10px;
  background-color: #ddd;
}
</style>
