import Vue from './vue'
import App from './App'
import {num1,num2} from './App.js'
import ca from './Cal'
import './main.css' // 引用css  需要css-loader


console.log(ca)
console.log(123)


new Vue({
    el:'#app',
    components:{
        app:App
    },
    template:`<app/>`
})

// npm init -y 根据目录名初始化package
// npm i webpack@3.6.0 -S
// npm i css-loader -S
// npm i style-loader -S
// npm i url-loader file-loader -S
// npm可以识别本目录中 package的配置，从而调用配置命令，以达到目录环境变量的效果
// package里配置的命令可以直接关联到 npm_modules里模块启动文件
// 可以将配置写在webpack.config.js中，npm-->package-->webpack-->config 