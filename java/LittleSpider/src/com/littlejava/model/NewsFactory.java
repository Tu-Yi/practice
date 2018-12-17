package com.littlejava.model;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 新闻构造类
 * @author yuankun
 */
public class NewsFactory {

    private File newsDir;

    public NewsFactory(String dirName) throws Exception {
        this.newsDir = new File(dirName);
        if(!newsDir.exists()){
            throw new Exception("文件夹路径不存在");
        }
        if(!newsDir.isDirectory()){
            throw new Exception("路径不是合法目录");
        }
    }

    public ArrayList<News> fetch() throws IOException {
        ArrayList<News> news = new ArrayList<>();
        File[] files = this.newsDir.listFiles();
        for(File file : files){
            BufferedReader newsReader = new BufferedReader(new FileReader(file));
            String title = newsReader.readLine();
            newsReader.readLine();
            String content = newsReader.readLine();
            newsReader.readLine();

            Map<String,String> related = new HashMap<>();
            related.put(newsReader.readLine(),newsReader.readLine());
            newsReader.readLine();
            related.put(newsReader.readLine(),newsReader.readLine());
            newsReader.readLine();
            related.put(newsReader.readLine(),newsReader.readLine());

            News n = new News(title,content,related);

            news.add(n);
        }
        return news;
    }
}
