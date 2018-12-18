package com.littlejava.model;

import org.json.JSONException;

import java.io.*;
import java.util.ArrayList;

/**
 * 新闻构造类
 * @author yuankun
 */
public class NewsFactory {

    private File newsDir;

    public NewsFactory(){}

    public NewsFactory(String dirName) throws Exception {
        this.newsDir = new File(dirName);
        if(!newsDir.exists()){
            throw new Exception("文件夹路径不存在");
        }
        if(!newsDir.isDirectory()){
            throw new Exception("路径不是合法目录");
        }
    }


    public ArrayList<News> fetch() throws IOException, JSONException {
        ArrayList<News> news = new ArrayList<>();
        File[] files = this.newsDir.listFiles();
        for(File file : files){
            NewsReader nr = null;
            if(file.getName().endsWith(".txt")){
                nr = new TxtNewsReader(file);
            }else if(file.getName().endsWith(".json")){
                nr = new JsonNewsReader(file);
            }

            news.add(nr.readNews());
        }
        return news;
    }
}
