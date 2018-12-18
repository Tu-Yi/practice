package com.xiedaimala.spider.model;


/**
 * 理解：News对象，实现viewable展示接口，定义新闻属性和显示方法
 */
public class News implements Viewable {
    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void display() {
        System.out.println("|Title| " + this.getTitle());
        System.out.println("|Content| " + this.getContent());
    }
}
