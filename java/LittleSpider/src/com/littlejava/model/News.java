package com.littlejava.model;

import java.util.Map;

/**
 * 新闻类
 * @author yuankun
 */
public class News {

    private String title;
    private String content;
    private Map<String,String> related;

    public News(String title, String content,Map<String,String> related) {
        this.title = title;
        this.content = content;
        this.related = related;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Map<String, String> getRelated() {
        return related;
    }
}
