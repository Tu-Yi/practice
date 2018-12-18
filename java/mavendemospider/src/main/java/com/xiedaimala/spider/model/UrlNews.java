package com.xiedaimala.spider.model;

/**
 * 理解：扩展News对象，增加url属性，实现展示方法，解耦url读取业务
 */
public class UrlNews extends News {
    private String url;
    public UrlNews(String url, String title, String content) {
        super(title, content);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("|URL| " + this.getUrl());
    }
}
