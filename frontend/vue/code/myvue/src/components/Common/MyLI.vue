<template>
    <li>
        <slot></slot>
    </li>
</template>
<script>
export default {
  name: 'my-li',
  data () {
    return {

    }
  }
}
</script>
<style scoped>
li{
    list-style: none;
    width: 33.3%;
    height: 100px;
    float: left;
    text-align: center;
    margin-top: 20px;
}
</style>
