package com.littlejava;

import com.littlejava.model.News;
import com.littlejava.model.NewsFactory;
import com.littlejava.model.NewsFactory_url;
import com.littlejava.model.Viewable;
import com.littlejava.view.ListView;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try{
//            String dirPath = Main.class.getClassLoader().getResource("read_hub").getPath();
//            NewsFactory newsHandler = new NewsFactory(dirPath);
//            ArrayList<News> news = newsHandler.fetch();
//            viewables.addAll(news);
//            ListView viewer = new ListView(viewables);
//            viewer.display();

            ArrayList<Viewable> viewables = new ArrayList<>();
            NewsFactory newsHandler = new NewsFactory_url("https://readhub.cn/topic/7IJeTlYF78U");
            ArrayList<News> news = newsHandler.fetch();
            viewables.addAll(news);
            ListView viewer = new ListView(viewables);
            viewer.display();




        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
