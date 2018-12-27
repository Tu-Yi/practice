<template>
    <mt-swipe :auto="0">
        <mt-swipe-item v-for="img in imgs" :key="img.id">
            <img :src="img.path" alt="no">
        </mt-swipe-item>
    </mt-swipe>
</template>
<script>
export default {
  name: 'my-swipe',
  data () {
    return {
      imgs: []
    }
  },
  props: ['url'],
  created () {
    this.$axios.get(this.url)
      .then(res => {
        this.imgs = res.data
      })
  }
}
</script>
<style scoped>
.mint-swipe{
    height: 200px;
    border-bottom: 1px solid #ddd;
}
img{
    height: 200px;
    width: 100%;
}
</style>


