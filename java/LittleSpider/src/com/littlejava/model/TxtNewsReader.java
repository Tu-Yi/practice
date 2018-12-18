package com.littlejava.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TxtNewsReader extends NewsReader {

    public TxtNewsReader(File file) {
        super(file);
    }

    @Override
    News readNews() throws IOException {
        BufferedReader newsReader = new BufferedReader(new FileReader(file));
        String title = newsReader.readLine();
        newsReader.readLine();
        String content = newsReader.readLine();
        newsReader.readLine();

        Map<String,Object> related = new HashMap<>();
        related.put(newsReader.readLine(),newsReader.readLine());
        newsReader.readLine();
        related.put(newsReader.readLine(),newsReader.readLine());
        newsReader.readLine();
        related.put(newsReader.readLine(),newsReader.readLine());

        News n = new News(title,content,related);

        return n;
    }
}
