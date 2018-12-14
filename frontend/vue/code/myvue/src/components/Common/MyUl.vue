<template>
    <ul>
        <slot></slot>
    </ul>
</template>
<script>
export default {
  name: 'my-ul',
  data () {
    return {

    }
  }
}
</script>
<style scoped>
ul{
    margin: 0;
    padding: 0;
}
</style>
