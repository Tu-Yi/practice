package com.company;

public abstract class NewsReader {
    public NewsReader() {
    }
    public int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public abstract News readNews(String Path);
}
