package com.xiedaimala.spider.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 理解：扩展UrlNews对象，定义相关新闻存取方法，解耦相关新闻处理
 */
public class NewsWithRelated extends UrlNews {
    private HashMap<String, String> relateds = new HashMap<String, String>();

    public NewsWithRelated(String url, String title, String content) {
        super(url, title, content);
    }

    public void addRelated(String title, String url) {
        this.relateds.put(title, url);
    }

    public HashMap<String, String> getRelateds() {
        return this.relateds;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("|Related|");
        for(Map.Entry<String, String> entry : this.relateds.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
