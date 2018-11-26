package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class News {

    private String title;
    private String content;

    void read(String url){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(url));
            title = reader.readLine();
            content = reader.readLine();
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    String display(){
        return  title + "\n" + content;
    }


}
