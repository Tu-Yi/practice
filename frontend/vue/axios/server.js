const http = require('http')

http.createServer(function (request, response) {
    let list=[
        {
            id:0,
            label:1,
            isShow:true
        },
        {
            id:1,
            label:2,
            isShow:true
        },
        {
            id:2,
            label:3,
            isShow:true
        },
        {
            id:3,
            label:4,
            isShow:true
        }
    ]
    let imgList=[
        {
            id:0,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg'
        },
        {
            id:1,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/68511809.jpg'
        }
    ]
    let newsList = [
        {
            id:0,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:1,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:2,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:3,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:4,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:5,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:6,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:7,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:8,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:9,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        },
        {
            id:10,
            path:'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
            title: '第三届三中全会在成都召开',
            creatTime: new Date(),
            clickCount: 32
        }
    ]
    response.writeHead(200, {
        'Access-Control-Allow-Origin': 'http://localhost:8080'
      })
    if(request.url==='/login'){
        response.end('success');
    }else if(request.url==='/list'){
        response.end(JSON.stringify(list))
    }else if(request.url==='/getlunbo'){
        response.end(JSON.stringify(imgList))
    }else if(request.url==='/newsList'){
        response.end(JSON.stringify(newsList))
    }
    else{
        response.end('234')
    }
}).listen(8888)

console.log('server listening on 8888')