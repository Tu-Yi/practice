# MyWebServer

## 项目介绍

一款轻量化Http服务器，基础TCP，主要功能有接收socket请求，包装解析请求，包装响应，路由等

## 更新说明

2019.5.9：提交项目

## 主要特点

- 静态页面服务器
- 接口服务器
- 文件服务器(开发中)

## 代码介绍

**Server：**服务器主类，接收请求，启动线程

**Dispatcher：**服务器线程类，调用路由，请求，响应，完成服务器工作

**Request：**包装请求，接收请求，解析HTTP请求

**Response：**包装响应，返回响应头和响应内容

**StaticDeal：**静态文件请求处理

**Servletable：**servlet接口

**LoginServlet：**登录处理

**RegisterServlet：**注册处理

**UploadServlet：**文件上传处理

**WebApp：**路由处理

**WebContext：**包装路由

**WebHandler：**解析路由XML

**Entity/Mapping：**路由实体

**IOClose：**关闭流

**static.properties：**静态页面配置

**web.xml：**路由配置