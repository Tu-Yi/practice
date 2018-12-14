自己搭建vue项目：
// npm init -y 根据目录名初始化package
// npm i vue -S npm i vue-loader -S  npm i vue-template-compiler -S
// npm i vue-router -S
// npm i axios -S
// npm i webpack@3.6.0 -S
// npm i css-loader -S
// npm i style-loader -S
// npm i url-loader file-loader -S
// npm i less -S
// npm i less-loader -S
// npm i html-webpack-plugin -S
// npm i babel-core babel-loader@7 babel-plugin-transform-runtime babel-preset-env -S
// npm i webpack-dev-server@2.9.0 -S
// 新建 webpack.dev.config.js  webpack.prod.config.js
// package-script:
"dev": "webpack-dev-server --open --hot --inline --config ./webpack.dev.config.js",
"prod": "webpack --config ./webpack.prod.config.js"
// 新建main.js,index.html,App.vue
// main.js中用‘render:c=>c(App)’代替引入组件和模板
// 具体例子将VueDiy


使用vue搭建项目
cnpm i -g vue-cli
vue init webpack ***
cnpm i axios mint-ui -S