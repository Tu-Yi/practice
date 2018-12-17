package com.littlejava;

import com.littlejava.model.News;
import com.littlejava.model.NewsFactory;
import com.littlejava.view.NewsListView;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        String dirPath = Main.class.getClassLoader().getResource("read_hub").getPath();
        NewsFactory newsHandler = new NewsFactory(dirPath);
        ArrayList<News> news = newsHandler.fetch();
        NewsListView viewer = new NewsListView(news);
        viewer.display();
    }
}
