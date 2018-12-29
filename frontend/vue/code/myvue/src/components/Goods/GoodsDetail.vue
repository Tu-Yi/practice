<template>
    <div>
        <my-swipe url="getlunbo" />
        <h1>{{detail.title}}</h1>
        <p>市场价：<span><del>￥9999</del></span>销售价: <span style="color:red">￥{{detail.price}}</span></p>
        <p>库存：{{detail.store}}</p>
        <p id="pNum">购买数量&nbsp;&nbsp;&nbsp;<span @click="minus">-</span><span>{{num}}</span><span @click="add">+</span></p>
        <div id="btnDiv">
            <mt-button type="primary" size="normal">立即购买</mt-button>
            <mt-button type="danger" size="normal" @click="showBall">加入购物车</mt-button>
        </div>
        <div class="plainDiv">
            <mt-button type="primary" plain size="large" @click="toGoodsInfo">图文介绍</mt-button>
            <mt-button type="danger" plain size="large">商品评论</mt-button>
        </div>
        <transition name="ball" @after-enter="afterEnter"> 
            <div class="ball" v-if="isExit"></div>
        </transition>
    </div>
</template>
<script>
import EventBus from '@/EventBus'
import GoodsTools from '@/GoodsTools'
export default {
  data () {
    return {
      detail: {},
      isExit: false,
      num: 0
    }
  },
  created () {
    console.log(this.$route.params.id)
    this.$axios.get('goodsDetail/' + this.$route.params.id)
      .then( res => {
          console.log(res)
          this.detail = res.data[0]
      } )
      .catch( err => {
          console.log(err)
      })
  },
  methods: {
    showBall () {
      this.isExit = true
    },
    afterEnter () {
      this.isExit = false
      GoodsTools.add({
          id: this.detail.id,
          num: this.num
      })
    },
    minus () {
      if(this.num <= 0){
          return
      }
      this.num--;
    },
    add () {
      this.num++;
    },
    toGoodsInfo () {
      this.$router.push({
          name: 'goods.detail.info',
          query: {
              id: this.detail.id
          }
      })
    }
  }
}
</script>
<style scoped>
#pNum span{
    margin-right: 1px;
    border: 1px solid #333;
    padding-left: 6px;
    padding-right: 6px;
}
h1{
    font-size: 1rem;
    padding:5px;
}
p{
    padding-left: 5px;
    padding-right: 5px;
}
p span{
    margin-right: 10px;
}
#btnDiv{
    display: flex;
    padding-left: 5px;
    padding-right: 5px;
    padding-bottom: 3px;
    border-bottom: 1px solid #ddd;
}
.mint-button{
    margin-right: 6px;
}
.mint-button--large{
    margin-top: 5px;
}
.plainDiv{
    padding-top:5px;
    padding-left: 5px;
    padding-right: 5px;
}
.ball-enter-active{
    animation: bounce-in 1.5s;
}
.ball-leave{
    opacity: 0;
}
@keyframes bounce-in{
    0% {
        transform: translate3d(0,0,0);
    }
    50% {
        transform: translate3d(100px,-100px,0);
    }
    75% {
        transform: translate3d(160px,0px,0);
    }
    100% {
        transform: translate3d(100px,170px,0);
    }
}
.ball{
    border-radius: 50%;
    background-color: red;
    width: 24px;
    height:24px;
    position:absolute;
    top:440px;
    left:120px;
    display: inline-block;
    z-index: 9999;
}
</style>

