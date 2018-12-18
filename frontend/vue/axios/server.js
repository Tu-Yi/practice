var express = require('express');
var app = express();

let list = [{
        id: 0,
        label: 1,
        isShow: true
    },
    {
        id: 1,
        label: 2,
        isShow: true
    },
    {
        id: 2,
        label: 3,
        isShow: true
    },
    {
        id: 3,
        label: 4,
        isShow: true
    }
]
let imgList = [{
        id: 0,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg'
    },
    {
        id: 1,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/68511809.jpg'
    }
]
let newsList = [{
        id: 0,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 1,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 2,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 3,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 4,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 5,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 6,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 7,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 8,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 9,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    },
    {
        id: 10,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
        title: '第三届三中全会在成都召开',
        creatTime: new Date(),
        clickCount: 32
    }
]
let newsDetail = {
    id: 0,
    title: '软银前员工推出机器人伴侣，售价 3100 美元',
    content: '据外媒报道，周二，软银机器人公司前员工的科技公司 Groove X 推出了一款售价约 3100 美元的机器人伴侣 ... 该公司表示，它设计这款名为 Lovot 的机器人是为了提高人们使用机器人的舒适感以及感受到机器人的爱意 ... 现在有两款 Lovot 机器人可供预定：一款 Lovot 机器人，售价为 59.8 万日元（约合 5300 美元），预计会在 2019 年底发货。',
    createTime: new Date(),
    clickCount: 10
}
let photoList = [{
        id: 1,
        categoryId: 2,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg',
    },
    {
        id: 2,
        categoryId: 1,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
    },
    {
        id: 3,
        categoryId: 1,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/68511809.jpg',
    },
    {
        id: 4,
        categoryId: 1,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/68511809.jpg',
    },
    {
        id: 5,
        categoryId: 1,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/68511809.jpg',
    },
    {
        id: 6,
        categoryId: 1,
        path: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/68511809.jpg',
    }
]
let categoryList = [{
        id: 1,
        label: '食品'
    },
    {
        id: 2,
        label: '截图'
    },
    {
        id: 3,
        label: '其他'
    }
]

app.all('*', function (req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "X-Requested-With");
    res.header("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
    res.header("X-Powered-By", ' 3.2.1')
    res.header("Content-Type", "application/json;charset=utf-8");
    next();
});

app.get('/login', function (req, res) {
    res.send('success');
})
app.get('/list', function (req, res) {
    res.send(JSON.stringify(list));
})
app.get('/getlunbo', function (req, res) {
    res.send(JSON.stringify(imgList));
})
app.get('/newsList', function (req, res) {
    res.send(JSON.stringify(newsList));
})
app.get('/newsDetail', function (req, res) {
    res.send(JSON.stringify(newsDetail));
})
app.get('/photoList/:categoryId', function (req, res) {
    var categoryId = req.params.categoryId
    if (categoryId!=="0") {
        let photoListNew = photoList.filter(function (element, index, arrays) {
            return element.categoryId+"" === categoryId
        })
        res.send(JSON.stringify(photoListNew));
    }else{
        res.send(JSON.stringify(photoList));
    }
})

var server = app.listen(8888, function () {

    var host = server.address().address
    var port = server.address().port

    console.log("应用实例，访问地址为 http://%s:%s", host, port)

})