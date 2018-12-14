package com.company;

public class News implements Displayable {

    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("News: i am News`s display"+"\n"+getTitle() + "\n" + getContent());
    }
}
