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

let newsContent = `
<p class="one-p">腾讯体育12月20日上海（文/李旭）在今天召开的2018中国职业足球总结大会上，中国足协党委书记杜兆才介绍协会将积极推进优秀外籍球员归化工作。中超规程出炉：外援注册4人上场3人 球员顶薪税前千万</p>
<p class="one-p"><img src="//inews.gtimg.com/newsapp_bt/0/6919673229/1000" class="content-picture"><i class="desc">埃尔克森在中超效力多年</i></p>
<p class="one-p">在介绍中国足协的发展规划时，杜兆才透露在中超加快建设世界一流联赛的过程中，要积极推进优秀外籍球员归化工作。“<strong>出台关于归化球员的实施政策，协助俱乐部试点归化具有较高水平的优秀外籍球员参加中超联赛</strong>。”</p>
<p class="one-p">在完善青训体系改革方面，足协将要求俱乐部设立青训总监负责制。2019赛季，俱乐部青训支出应占俱乐部总支出的10%以上，2021年达到15%以上。各中超中甲俱乐部至少建设从U19-U13的五级梯队。</p>
<p class="one-p">此外，中国足协也将积极启用足球青少年人才海外孵化计划。<strong>组织各级U系列队伍赴欧美足球发达国家长期训练比赛</strong>，在与狼共舞中提高整体实力与比赛水平；组织球探在全国选拔具有足球天赋和发展潜力的国内顶级青少年球员，送往欧洲足球俱乐部常年培养锻炼，努力打造未来的世界级球星。</p>
`

let newsDetail = {
    id: 0,
    title: '软银前员工推出机器人伴侣，售价 3100 美元',
    content: newsContent,
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
    }
]
let photoDetails = [
    {
        photoId: 1,
        title: '足协高层：试点归化高水平外援 组织青少年赴欧美长期集训',
        createTime: new Date(),
        clickCount: 1000,
        content: newsContent
    },
    {
        photoId: 2,
        title: '足协高层：试点归化高水平外援 组织青少年赴欧美长期集训',
        createTime: new Date(),
        clickCount: 1000,
        content: newsContent
    },
    {
        photoId: 3,
        title: '足协高层：试点归化高水平外援 组织青少年赴欧美长期集训',
        createTime: new Date(),
        clickCount: 1000,
        content: newsContent
    }
]
let photos = [
    {
        photoId: 1,
        thumbs: [
            {
                id: 1,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg'
            },
            {
                id: 2,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg'
            },
            {
                id: 3,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg'
            },
            {
                id: 4,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/68511809.jpg'
            },
            {
                id: 5,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg'
            }
        ]
    },
    {
        photoId: 2,
        thumbs: [
            {
                id: 1,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg'
            },
            {
                id: 2,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg'
            },
            {
                id: 3,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg'
            },
            {
                id: 4,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/68511809.jpg'
            },
            {
                id: 5,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg'
            }
        ]
    },
    {
        photoId: 3,
        thumbs: [
            {
                id: 1,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg'
            },
            {
                id: 2,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg'
            },
            {
                id: 3,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg'
            },
            {
                id: 4,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/68511809.jpg'
            },
            {
                id: 5,
                src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-12-12/56543555.jpg'
            }
        ]
    }
]
let comments = [
    {
        id: 1,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户1',
        content: '大家都很不错'
    },
    {
        id: 2,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户2',
        content: '大家都很不错'
    },
    {
        id: 3,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户3',
        content: '大家都很不错'
    },
    {
        id: 4,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户4',
        content: '大家都很不错'
    },
    {
        id: 5,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户5',
        content: '大家都很不错'
    },
    {
        id: 6,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户6',
        content: '大家都很不错'
    },
    {
        id: 7,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户7',
        content: '大家都很不错'
    },
    {
        id: 8,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户8',
        content: '大家都很不错'
    },
    {
        id: 9,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户9',
        content: '大家都很不错'
    },
    {
        id: 10,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户10',
        content: '大家都很不错'
    },
    {
        id: 11,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户11',
        content: '大家都很不错'
    },
    {
        id: 12,
        relativeId: 1,
        relativeType: 'photo',
        createTime: new Date(),
        person: '匿名用户12',
        content: '大家都很不错'
    }
]
let goodsList = [
    {
        id: 1,
        src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
        title: '[1]龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉',
        price: 2467,
        store: 60
    },
    {
        id: 2,
        src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
        title: '[2]龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉',
        price: 2467,
        store: 60
    },
    {
        id: 3,
        src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
        title: '[3]龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉',
        price: 2467,
        store: 60
    },
    {
        id: 4,
        src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
        title: '[4]龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉',
        price: 2467,
        store: 60
    },
    {
        id: 5,
        src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
        title: '[5]龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉',
        price: 2467,
        store: 60
    },
    {
        id: 6,
        src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
        title: '[6]龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉',
        price: 2467,
        store: 60
    },
    {
        id: 7,
        src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
        title: '[7]龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉',
        price: 2467,
        store: 60
    },
    {
        id: 8,
        src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
        title: '[8]龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉',
        price: 2467,
        store: 60
    },
    {
        id: 9,
        src: 'http://jtc-img.oss-cn-shenzhen.aliyuncs.com/18-11-21/73370656.jpg',
        title: '[9]龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉龙夫山泉',
        price: 2467,
        store: 60
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
app.get('/photoDetail/:photoId', function (req, res) {
    var photoId = req.params.photoId
    let photoDetail = photoDetails.filter(function (element, index, arrays) {
        return element.photoId+"" === photoId
    })
    res.send(JSON.stringify(photoDetail));
})
app.get('/photoThumbs/:photoId', function (req, res) {
    var photoId = req.params.photoId
    let photoThumbs = photos.filter(function (element, index, arrays) {
        return element.photoId+"" === photoId
    })
    res.send(JSON.stringify(photoThumbs));
})
app.get('/getComments/:relativeId/:relativeType/:page', function (req, res) {
    let relativeId = req.params.relativeId
    let relativeType = req.params.relativeType
    let page = req.params.page * 10
    let count = comments.length
    let isFull = parseInt((count%100)/10) === (req.params.page-2) 
    let newComments = comments.filter(function (element, index, arrays) {
        return (element.relativeId+"" === relativeId && element.relativeType+"" === relativeType && element.id <= page)
    })
    let commentObj = {
        count: count,
        isFull: !isFull,
        newComments: newComments
    }
    res.send(JSON.stringify(commentObj));
})
app.get('/goodsList/:page/:pagesize', function (req, res) {
    let page = req.params.page
    let pagesize = req.params.pagesize
    let startId = pagesize * (page-1)
    let endId = page * pagesize
    let newGoodsList = goodsList.filter(function (element, index, arrays) {
        return (element.id > startId && element.id <= endId)
    })
    res.send(JSON.stringify(newGoodsList));
})
app.get('/goodsDetail/:id', function (req, res) {
    let id = req.params.id
    let newGoodsList = goodsList.filter(function (element, index, arrays) {
        return (element.id + '' === id)
    })
    res.send(JSON.stringify(newGoodsList));
})

var server = app.listen(8888, function () {

    var host = server.address().address
    var port = server.address().port

    console.log("应用实例，访问地址为 http://%s:%s", host, port)

})