<template>
    <div>{{msg}}</div>
</template>
<script>
export default {
  data () {
    return {
      msg: ''
    }
  },
  created () {
    this.sendTitle()
    this.msg = this.$route.query.id
  },
  methods: {
    sendTitle () {
      this.$emit('getChildTitle', '新闻详情')
    }
  }
}
</script>
