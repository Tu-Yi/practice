<template>
    <div>
        <article>
            <section v-for="item in newsList" :key="item.id">
                <router-link :to="currentPath" @click.native="toDetail(item.id)">
                    <div id="imgDiv">
                        <img :src="item.path" alt="不存在">
                    </div>
                    <div id="contentDiv">
                        <div id="titleDiv">{{item.title}}</div>
                        <div id="bottomDiv">
                            <span id="click">{{item.clickCount}}</span>
                            <span id="creatTime">{{item.creatTime | formatDate('YYYY-MM-DD')}}</span>
                        </div>
                    </div>
                </router-link>
            </section>
        </article>
    </div>
</template>
<script>
import store from '@/Vuex/store'
export default {
  data () {
    return {
      newsList: [],
      currentPath: ''
    }
  },
  store,
  created () {
    console.log(this.$store.state.routerBack)
    this.currentPath = this.$route.path
    this.sendTitle()
    this.$axios.get('newsList')
      .then(res => {
        console.log(res)
        this.newsList = res.data
      })
  },
  methods: {
    sendTitle () {
      this.$emit('getChildTitle', '新闻列表')
    },
    toDetail (id) {
      this.$store.commit('set', this.currentPath)
      this.$nextTick(() => {
        this.$router.push({name: 'news.detail', query: {id: id}})
      })
    }
  }
}
</script>
<style scoped>
#content{
    margin-bottom: 50px;
}
article{
    margin-top: 10px;
}
section a{
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
#titleDiv{
    flex: 1;
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
