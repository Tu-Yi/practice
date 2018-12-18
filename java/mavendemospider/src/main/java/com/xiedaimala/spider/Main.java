package com.xiedaimala.spider;

import com.xiedaimala.spider.model.NewsWithRelated;
import com.xiedaimala.spider.model.UrlNewsReader;
import com.xiedaimala.spider.model.Viewable;
import com.xiedaimala.spider.view.ListViewer;

import java.util.*;

public class Main {

    // 本地存储新闻内容，如何在终端显示

    // 1. 抽象出 对象
    // 2. 设计 对象应该具有的属性，状态和行为
    // 3. 思考 对象之间交互
    // 4. 开始写代码

    static final int maximumURL = 10;

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        // 广度优先搜索
        Queue<NewsWithRelated> newsQueue = new LinkedList<NewsWithRelated>();

        //读取第一篇新闻对象
        String startUrl = "https://readhub.me/topic/5bMmlAm75lD";
        NewsWithRelated startNews = UrlNewsReader.read(startUrl);

        int count = 0;

        //用set装url达到去重的目的
        Set<String> visited = new HashSet<String>();
        visited.add(startUrl);

        //将第一篇新闻对象放入队列
        newsQueue.add(startNews);

        ArrayList<Viewable> results = new ArrayList<Viewable>();
        while (!newsQueue.isEmpty() && count <= maximumURL) {

            //先进先出取得当前对象放入results,多态
            NewsWithRelated current = newsQueue.poll();
            results.add(current);
            count += 1;
            //循环获取相关新闻里的相关新闻
            for (Map.Entry<String, String> entry : current.getRelateds().entrySet()) {
                String url = entry.getValue();
                NewsWithRelated next = UrlNewsReader.read(url);
                if (!visited.contains(url)) {
                    newsQueue.add(next);
                    visited.add(url);
                }
            }
        }
        long endTime=System.currentTimeMillis();

        //展示
        new ListViewer(results).display();

        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }
}

