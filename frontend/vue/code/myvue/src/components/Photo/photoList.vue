<template>
    <div>
      <header>
        <ul>
          <li>
            <a href="javascript:;" @click="loadPhotoByType(0)">全部图片</a>
          </li>
          <li>
            <a href="javascript:;" @click="loadPhotoByType(1)">食品</a>
          </li>
          <li>
            <a href="javascript:;" @click="loadPhotoByType(2)">截图</a>
          </li>
          <li>
            <a href="javascript:;" @click="loadPhotoByType(3)">其他</a>
          </li>
        </ul>
      </header>
      <ul id="photolist">
        <li v-for="item in photoList" :key="item.id" :id="item.id">
          <router-link :to="{name: 'photo.detail', params: {photoId: item.id}}">
            <img v-lazy="item.path" alt="图片不存在">
          </router-link>
        </li>
      </ul>
    </div>
</template>
<script>
export default {
  data () {
    return {
      msg: '',
      photoList: []
    }
  },
  beforeRouteUpdate (to, from, next) {
    this.loadPhoto(to.params.categoryId)
    next()
  },
  created () {
    this.loadPhoto(this.$route.params.categoryId)
  },
  methods: {
    loadPhotoByType (categoryId) {
      this.$router.push({
        name: 'photo.list',
        params: {
          categoryId
        }
      })
    },
    loadPhoto (categoryId) {
      this.$axios.get('photoList/' + categoryId)
        .then(res => {
          console.log(res)
          this.photoList = res.data
          if (this.photoList.length === 0) {
            this.$toast({
              message: '没有图片',
              iconClass: 'iconfont icon-danmokuai'
            })
          }
        })
    }
  }
}
</script>
<style scoped>
div{
  background-color: #ddd;
}
ul{
    margin: 0;
    padding: 0;
}
li{
  list-style: none;
}
header li{
    height: 20px;
    float: left;
    text-align: left;
    padding: 5px;
}
#photolist li{
  margin-top: 5px;
  text-align: center;
  padding-left: 5px;
  padding-right: 5px;
}
#photolist li img{
  width: 100%;
  height: 200px;
}
image[lazy=loading] {
  width: 40px;
  height: 300px;
  margin: auto;
}
</style>
