<template>
    <div>
        <header>
            <h1>{{detail.title}}</h1>
            <div id="div_info">
            <div>{{detail.clickCount}}人看过</div>
            <div id="div_time">{{detail.createTime | formatDate('YYYY-MM-DD')}}</div>
            </div>
      </header>
      <vue-preview :slides="photos"></vue-preview>
      <section v-html="detail.content" class="newsDetail">
      </section>
      <my-comment :relativeId="photoId" relativeType="photo"></my-comment>
    </div>
</template>
<script>
export default {
  data () {
    return {
      detail: {},
      photos: [],
      photoId: ''
    }
  },
  created () {
    this.photoId = this.$route.params.photoId
    this.$axios.get('photoDetail/' + this.photoId)
      .then(res => {
        this.detail = res.data[0]
      })
      .catch(err => console.log(err))
    this.$axios.get('photoThumbs/' + this.photoId)
      .then(res => {
        console.log(res)
        this.photos = res.data[0].thumbs
        this.photos.forEach(element => {
          element.msrc = element.src
          element.w = 200
          element.h = 200
        })
      })
      .catch(err => console.log(err))
  }
}
</script>
<style scoped>
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
