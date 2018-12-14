<template>
    <div>
        <header>{{text}}</header>
        <hr/>
        <keep-alive>
            <router-view></router-view>
        </keep-alive>
    </div>
</template>
<script>
export default {
    data () {
        return {
            text: 'App'
        }
    }
}
</script>

