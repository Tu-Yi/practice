module.exports = {
    entry:{
        'main':'./main.js'
    }, // 入口
    output:{
        filename:'./build.js'
    }, // 出口
    watch:true, // 自动生成
    // 调用模块
    module:{
        loaders:[
            {
                test:/\.css$/,
                loader:'style-loader!css-loader'
            },
            {
                test:/\.(jpg|png)/,
                loader:'url-loader?limit=4096'
            }
        ]
    }
}// 开发环境