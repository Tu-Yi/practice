<template>
    <div>
        <div v-for="(good,index) in list" :key="index" class="section">
          <div>
            <img :src="good.src" alt="" class="imgDiv">
          </div>
          <div class="contentDiv">
            <p class="titleDiv">{{good.title | convertStr(20)}}</p>
            <p class="bottomDiv">￥{{good.price}}</p>
          </div>
          <p class="pNum">
            <span @click="subStract(good)">-</span><span>{{good.num}}</span><span @click="add(good)">+</span><br>
            <a href="javascript:;" @click="del(index)">删除</a>
          </p>
        </div>
        <footer>
          <p>购买商品数量：{{payment.count}},&nbsp;总价格：￥{{payment.price}}</p>
        </footer>
    </div>
</template>
<script>
import GoodsTools from '@/GoodsTools'
export default {
  data () {
    return {
      list: []
    }
  },
  beforeRouteLeave (to, from, next) {
    console.log(1111)
    if(confirm('do you leave?')){
      let obj = {}
      this.list.forEach( cur => {
        obj[cur.id] = cur.num
      })
      GoodsTools.saveGoods(obj)
      next()
    }else {
      next(false)
    }
  },
  methods: {
    subStract (good) {
      good.num--
    },
    add (good) {
      good.num++
    },
    del (index) {
      this.list.splice(index,1)
    }
  },
  computed: {
    payment () {
      let price = 0
      let count = 0
      this.list.forEach( good => {
        count += good.num
        price += good.price * good.num
      })
      return {
        count,
        price
      }
    }
  },
  created () {
    let goodsList = GoodsTools.getGoodsList()
    let ids = Object.keys(goodsList).join(',');
    this.$axios.get('getShopCartList/' + ids)
      .then( res => {
        this.list = res.data
        this.list.forEach(element => {
          if(goodsList[element.id]){
            //element.num = goodsList[element.id]
            this.$set(element,'num',goodsList[element.id])
          }
        });
      })
      .catch(err => console.log(err))
  }
}
</script>
<style scoped>
.section {
    display: flex;
    height: 100px;
    border-bottom: 1px solid #ddd;
    padding-top: 10px;
    padding-bottom: 10px;
}
.imgDiv{
    flex: 0 1 100px;
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 10px;
}
img{
    width: 70px;
    height: 70px;
}
.pNum span{
    border: 1px solid #333;
    padding-left: 6px;
    padding-right: 6px;
}
.pNum{
    padding-top: 30px;
    padding-left: 5px;
    padding-right: 5px;
    width: 100px;
}
.pNum span{
    margin-right: 2px;
}
.bottomDiv{
  color: red;
}
</style>
