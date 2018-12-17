package com.littlejava.view;

import com.littlejava.model.News;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * 新闻展示类
 * @author yuankun
 */
public class NewsListView {

    private ArrayList<News> news;

    public NewsListView(ArrayList<News> news) {
        this.news = news;
    }

    public void display(){
        for(News n : news){
            System.out.println("--------------------------------------------------");
            System.out.println("title: "+n.getTitle());
            System.out.println("content: "+n.getContent()+"\n");
            Map<String,String> related = n.getRelated();
            Iterator<Map.Entry<String, String>> iter = related.entrySet().iterator();
            while (iter.hasNext()){
                Map.Entry<String, String> entry = iter.next();
                System.out.println("related date: "+entry.getKey());
                System.out.println("related title: "+entry.getValue());
            }

        }
    }
}
