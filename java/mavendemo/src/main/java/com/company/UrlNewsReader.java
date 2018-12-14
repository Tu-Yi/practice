package com.company;

public class UrlNewsReader extends NewsReader {
    @Override
    public UrlNews readNews(String Path) {
        return new UrlNews("readNews","123",Path);
    }
}
