package com.company;

public class UrlNews extends News {
    private String url;


    /**
     * @param title
     * @param content
     * @param url
     */
    public UrlNews(String title, String content,String url) {
        super(title, content);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("UrlNews: i am UrlNews`s display"+"\n"+getUrl());
    }
}
