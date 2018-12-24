package com.xiedaimala.spider.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * 理解：这里能不能仍然继承NewsReader？有没有什么问题，NewsReader多一个url的构造器
 */
public class UrlNewsReader {
    public static NewsWithRelated read(String url) throws IOException {
        //Jsoup 读取和解析 页面
        Document doc = Jsoup.connect(url).get();

        // 根据title标签获取标题
        Elements titleElements = doc.select("title");
        String title = titleElements.first().text();
        // 根据meta标签获取内容
        String content = doc.select("meta[name=description]").attr("content");


        //构造新闻对象
        NewsWithRelated news = new NewsWithRelated(url, title, content);

        // 获取相关新闻列表
        Elements relatedElements = doc.select(".timeline__item___3bF6k");
        for (Element element : relatedElements) {
            String relatedTitle = element.select(".date-item___14w-B").text();
            Elements children  = element.children();
            String relatedUrl = children.get(3).child(0).absUrl("href");

            news.addRelated(relatedTitle, relatedUrl);
        }

        return news;
    }
}
