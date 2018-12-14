package com.xiedaimala.spider.model;

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
