package com.xiedaimala.spider;

import com.xiedaimala.spider.activiy.SpiderThread;
import com.xiedaimala.spider.model.NewsWithRelated;
import com.xiedaimala.spider.model.SearchSate;
import com.xiedaimala.spider.model.UrlNewsReader;
import com.xiedaimala.spider.view.ListViewer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ThreadMain {

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();

        // 广度优先搜索
        // 封装共享资源
        SearchSate searchSate = new SearchSate(100);

        // 装入第一个新闻，注意域名改为cn
        String startUrl = "https://readhub.cn/topic/5bMmlAm75lD";
        NewsWithRelated startNews = UrlNewsReader.read(startUrl);

        // 放入队列
        searchSate.visit(startNews);
        while (searchSate.hasTarget()) {
            NewsWithRelated current = searchSate.poll();
            searchSate.addResult(current);
            List<SpiderThread> spiders = new ArrayList<SpiderThread>();
            for (Map.Entry<String, String> entry : current.getRelateds().entrySet()) {
                String url = entry.getValue();
                // 读取相关新闻放入线程
                spiders.add(new SpiderThread(searchSate, url));
            }

            //等待所有线程停止
            for (SpiderThread spider : spiders) {
                spider.join();
            }
        }
        long endTime=System.currentTimeMillis();

        new ListViewer(searchSate.getResults()).display();

        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }
}
