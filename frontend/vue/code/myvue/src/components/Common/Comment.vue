<template>
    <div>
        <section>
            <textarea v-model="newComment" ref="textarea" ></textarea>
        </section>
        <section>
            <mt-button type="primary" size="large" @click.native="sendComment">发表评论</mt-button>
        </section>
        <section>
            <ul>
                <li v-for="item in comments.newComments" :key="item.id">
                    {{item.person}} | {{item.content}} | {{item.createTime | formatDate}}
                </li>
            </ul>
        </section>
        <section>
            <mt-button type="primary" size="large" plain @click.native="loadMore" v-show="this.comments.isFull">加载更多</mt-button>
        </section>
    </div>
</template>
<script>
export default {
  name: 'my-comment',
  data () {
    return {
      newComment: '',
      page: 1,
      comments: {}
    }
  },
  props: ['relativeId', 'relativeType'],
  created () {
    this.getComments()
  },
  methods: {
    sendComment () {
      if (!this.$refs.textarea.value) {
        this.$toast({
          message: '请填写评论'
        })
      }
    },
    getComments () {
      console.log('getComments/' + this.relativeId + '/' + this.relativeType + '/' + this.page)
      this.$axios.get('getComments/' + this.relativeId + '/' + this.relativeType + '/' + this.page)
        .then(res => {
          console.log(res)
          this.comments = res.data
        })
        .catch(err => console.log(err))
    },
    loadMore () {
      this.page++
      this.getComments()
    }
  }
}
</script>
<style scoped>
div{
    padding:5px;
}
textarea{
    width: 98%;
    height: 50px;
    overflow-y:auto;
    resize:none;
}
ul{
    margin: 0;
    padding: 0;
}
li{
    list-style: none;
    padding-left: 5px;
}
</style>
