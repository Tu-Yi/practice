<template>
    <div>
        <div id='imgDiv'>
            <img :src="imgPath" alt="图片不存在">
        </div>
        <div id=inputDiv>
            <input type="text" placeholder="用户名" v-model="userName">
            <input type="password" placeholder="密码" v-model="password">
            <button @click="doLogin">登录</button>
        </div>
    </div>
</template>
<script>
import img from './1.jpg'
export default {
    data(){
        return {
            imgPath:img,
            userName:'',
            password:''
        }
    },
    created(){
        window.localStorage.clear();
    },
    methods:{
        doLogin(){
            if(this.userName && this.password){
                this.$axios.get('login',{
                    transformResponse(data){
                        console.log(data)
                    }//3
                })
                .then(res => {
                    console.log('响应回来了',res.request.response);
                    if(res.request.response === 'success'){
                        window.localStorage.setItem('userName',this.userName);
                        this.$router.push({name: 'todoList'});
                    }
                })//5
                // 一个失败
                .catch(function(err){
                    console.log(err);
                })
            }else{
                alert('请输入用户名或者密码')
            }
        }
    }
}
</script>

<style>
div{
    margin:0 auto;
    width: 375px;
}
img{
    width: 100px;
    height: 100px;
}
#imgDiv{
    display: flex;
    align-items: center;
    justify-content: center;
    height: 300px;
}
#inputDiv{
    text-align: center;
}
input{
    height: 3rem;
    margin-bottom: 3rem;
    width: 30rem;
}
button{
    height: 3rem;
    width: 30rem;
}
</style>

