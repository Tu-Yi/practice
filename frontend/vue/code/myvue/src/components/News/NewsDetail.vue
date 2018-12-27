<template>
    <div id="contain">
      <header>
        <h1>{{detail.title}}</h1>
        <div id="div_info">
          <div>{{detail.clickCount}}人看过</div>
          <div id="div_time">{{detail.createTime | formatDate('YYYY-MM-DD')}}</div>
        </div>
      </header>
      <section v-html="detail.content" class="newsDetail">
      </section>
    </div>
</template>
<script>
export default {
  data () {
    return {
      msg: '',
      detail: {
        title: '',
        clickCount: 0,
        createTime: '',
        content: ''
      },
      appTitle: ''
    }
  },
  created () {
    this.msg = this.$route.query.id
    this.$axios.get('newsDetail')
      .then(res => {
        console.log("res ", res.data)
        this.detail = res.data
      })
  },
  beforeRouteEnter (to,from,next) {
    let title = ''
    console.log("from "+from.name)
    console.log("to "+to.name)
    if (from.name == null) {
      if(to.name === 'news.detail'){
        title = '新闻详情'
      }else if (to.name === 'goods.detail.info'){
        title = '图文详情'
      }
    }else if (from.name === 'news.list') {
      title = '新闻详情'
    }else if (from.name === 'goods.detail') {
      title = '图文详情'
    }
    console.log(title)
    next(vm => {
      vm.appTitle = title
    })
  },
  watch: {
    appTitle: function(){
      this.$emit('getChildTitle', this.appTitle)
    }
  }
}
</script>
<style scoped>
#contain{
  padding: 10px;
}
h1{
  font-size: 1.5rem;
}
#div_info{
  display:flex;
  border-bottom: 1px solid #ddd;
}
section{
  margin-top: 10px;
  line-height: 25px;
  letter-spacing: 1.5px;
}
#div_time{
  flex:1;
  text-align: right;
}
</style>
