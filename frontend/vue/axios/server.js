const http = require('http')

http.createServer(function (request, response) {
    response.writeHead(200, {
        'Access-Control-Allow-Origin': 'http://127.0.0.1:5500'
      })
    if(request.url==='/login'){
        response.end('成都');
    }else if(request.url==='/add'){
        response.end('高新区');
    }
    else{
        response.end('234')
    }
}).listen(8888)

console.log('server listening on 8888')