<template>
    <div id="contain">
      <header>
        <h1>{{detail.title}}</h1>
        <div id="div_info">
          <div>{{detail.clickCount}}人看过</div>
          <div id="div_time">{{detail.createTime | formatDate('YYYY-MM-DD')}}</div>
        </div>
      </header>
      <section>
        {{detail.content}}
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
      }
    }
  },
  created () {
    this.sendTitle()
    this.msg = this.$route.query.id
    this.$axios.get('newsDetail')
      .then(res => {
        console.log(res)
        this.detail = res.data
      })
  },
  methods: {
    sendTitle () {
      this.$emit('getChildTitle', '新闻详情')
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
