<template>
    <div>
        <article>
            <section v-for="item in newsList" :key="item.id">
                <div id="imgDiv">
                    <img :src="item.path" alt="不存在">
                </div>
                <div id="contentDiv">
                    <div>{{item.title}}</div>
                    <div id="bottomDiv">
                        <span id="click">{{item.clickCount}}</span>
                        <span id="creatTime">{{item.creatTime | formatDate('YYYY-MM-DD')}}</span>
                    </div>
                </div>
            </section>
        </article>
    </div>
</template>
<script>
export default {
  data () {
    return {
      newsList: []
    }
  },
  created () {
    this.$axios.get('newsList')
      .then(res => {
        console.log(res)
        this.newsList = res.data
      })
  }
}
</script>
<style scoped>
article{
    margin-top: 20px;
}
section{
    display: flex;
    height: 52px;
    border-bottom: 1px solid #ddd;
    padding-top: 10px;
    padding-bottom: 10px;
}
#imgDiv{
    flex: 0 1 60px;
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 10px;
}
img{
    width: 50px;
    height: 50px;
}
#contentDiv{
    flex: 1 1 auto;
    display: flex;
    flex-direction: column;
}
#bottomDiv{
    width:100%;
    align-self:flex-end;
    display: flex;
    vertical-align: bottom;
}
#click{
    flex: 1 1 auto;
    align-self:flex-end;
}
#creatTime{
    flex: 1 1 60px;
    align-self:flex-end;
}
</style>
