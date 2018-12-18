package com.littlejava.model;

import org.json.JSONException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class NewsFactory_url extends NewsFactory {

    private String url;

    public NewsFactory_url(String url) {
        this.url = url;
        try {

            int iStatus = testUrl(url);
            if(iStatus!=200){
                throw new Exception("网址无法访问，请检查URL地址或网络连接是否正确");
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    @Override
    public ArrayList<News> fetch() throws IOException, JSONException {
        ArrayList<News> news = new ArrayList<>();
        NewsReader newsReader = new UrlNewsReader(url);
        News n = newsReader.readNews();
        news.add(n);
        return news;
    }

    public static int testUrl(String url) throws Exception {
        int iStatus = 404;

        URL urlObj = new URL(url);
        HttpURLConnection oc = (HttpURLConnection) urlObj.openConnection();
        oc.setUseCaches(false);
        oc.setConnectTimeout(3000);
        iStatus = oc.getResponseCode();
        if(200==iStatus){
            return iStatus;
        }
        return  iStatus;

    }
}
