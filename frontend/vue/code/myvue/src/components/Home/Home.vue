<template>
    <div>
        <!-- <mt-swipe :auto="0">
            <mt-swipe-item v-for="img in imgs" :key="img.id">
                <img :src="img.path" alt="no">
            </mt-swipe-item>
        </mt-swipe> -->
        <my-swipe url="getlunbo" />
        <my-ul>
            <my-li v-for="(grid,index) in grids" :key="index">
              <router-link :to="grid.router">
                <div :class="grid.itemClass">
                    {{grid.title}}
                </div>
              </router-link>
            </my-li>
        </my-ul>
    </div>
</template>
<script>
export default {
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      imgs: [],
      grids: [
        {
          title: '新闻资讯',
          itemClass: 'item item_news',
          router: {name: 'news.list'}
        },
        {
          title: '图文分享',
          itemClass: 'item item_share',
          router: {name: 'photo.list', params: {categoryId: 0}}
        },
        {
          title: '商品展示',
          itemClass: 'item item_product',
          router: {name: 'goods.list'}
        },
        {
          title: '留言反馈',
          itemClass: 'item item_feedback',
          router: {name: 'news.list'}
        },
        {
          title: '搜索资讯',
          itemClass: 'item item_searchnews',
          router: {name: 'news.list'}
        },
        {
          title: '联系我们',
          itemClass: 'item item_contact',
          router: {name: 'news.list'}
        }
      ]
    }
  },
  created () {
    this.sendTitle()
    this.$axios.get('getlunbo')
      .then(res => {
        console.log(res)
        this.imgs = res.data
      })
  },
  methods: {
    sendTitle () {
      this.$emit('getChildTitle', '首页')
    }
  }
}
</script>
<style scope>
.mint-swipe{
    height: 200px;
    border-bottom: 1px solid #ddd;
}
img{
    height: 200px;
    width: 100%;
}
.item{
    background-repeat: no-repeat;
    background-position: top center;
    text-align: center;
    height: 100px;
    line-height: 170px;
    background-size: 35%;
    vertical-align: bottom;
}
.item_news{
  background-image: url("../../assets/img/news.png");
}
.item_share{
  background-image: url("../../assets/img/share.png");
}
.item_product{
  background-image: url("../../assets/img/product.png");
}
.item_feedback{
  background-image: url("../../assets/img/feedback.png");
}
.item_searchnews{
  background-image: url("../../assets/img/searchnews.png");
}
.item_contact{
  background-image: url("../../assets/img/contact.png");
}
</style>
