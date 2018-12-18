package com.littlejava.model;

import java.util.Iterator;
import java.util.Map;

/**
 * 新闻类
 * @author yuankun
 */
public class News implements Viewable {

    private String title;
    private String content;
    private Map<String,Object> related;

    public News(String title, String content,Map<String,Object> related) {
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

    public Map<String, Object> getRelated() {
        return related;
    }

    @Override
    public void display(){
        System.out.println("title: "+getTitle());
        System.out.println("content: "+getContent()+"\n");
        Map<String,Object> related = getRelated();
        Iterator<Map.Entry<String, Object>> iter = related.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, Object> entry = iter.next();
            System.out.println("related date: "+entry.getKey());
            System.out.println("related title: "+entry.getValue());
        }
    }
}
