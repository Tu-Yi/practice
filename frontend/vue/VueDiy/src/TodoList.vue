<template>
    <div>
        <div class="itemClass" v-for="(item) in list" v-show="item.isShow" :key="item.id">
            <input :id="item.id" type="checkbox" @click="item.isShow=!item.isShow"><label :for="item.id">{{item.label}}</label>
        </div>
        <div ref="refDiv">
            {{result}}
        </div>
        <div>
            <button @click="exitLogin">退出登录</button>
        </div>
    </div>
</template>
<script>
export default {
    data(){
        return {
            list:[]
        }
    },
    watch:{
        list: {
                deep: true,
                handler(n,o){
                    console.log(o,n)
                }
            }
    },
    computed:{
        result(){
            var sum=0;
            this.list.forEach(function(data){
            sum=parseInt(sum)+parseInt(data.id);
            });
            return sum;
        }
    },
    beforeCreate () {
        console.log("beforeCreate",this.list)  // 组件创建之前，undefined
    },
    created () {
        console.log("created",this.list) // 组件创建之后，可以操作数据，hello com  可以掉ajax
        console.log("created",this.$refs.refDiv)
    },
    mounted(){
        console.log("mounted",this.list) 
        console.log("mounted",this.$refs.refDiv)
        this.getList();
    },
    beforeUpdate () {
        console.log("beforeUpdate",this.list)  // 更新前
    },
    updated () {
        console.log("updated",this.list) // 更新后
    },
    beforeDestroy () {
        console.log('beforeDestroy')  // 
    },
    destroyed () {
        console.log('destroyed') // 
    },
    activated () {
        console.log('activated')  // 避免频繁销毁创建，被keep-alive包含
    },
    deactivated () {
        console.log('deactivated') // 避免频繁销毁创建，被keep-alive包含
    },
    methods:{
        getList(){
            this.$axios.get('list',{
                transformResponse(data){
                    console.log(data)
                }
            })
            .then(res => {
                console.log('响应回来了',res.request.response);
                this.list = JSON.parse(res.request.response)
            })
            // 一个失败
            .catch(function(err){
                console.log(err);
            })
        },
        exitLogin(){
            window.localStorage.clear();
            this.$router.push({name: 'login'});
        }
    }
}
</script>

<style>
.itemClass{
    height: 3rem;
    line-height: 3rem;
    border-bottom: 1px solid #ddd;
}
div{
    margin:0 auto;
    width: 375px;
}
</style>

