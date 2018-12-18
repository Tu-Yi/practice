package com.littlejava.model;

import org.json.JSONException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UrlNewsReader extends NewsReader {

    public UrlNewsReader(String url) {
        super(url);
    }

    @Override
    News readNews() throws IOException, JSONException {

        News n = null;
        Document doc = Jsoup.connect(url).get();

        Elements titleEle = doc.select("title");
        String title = titleEle.first().text();

        String content = doc.select("meta[name=description]").attr("content");

        Map<String,Object> related = new HashMap<>(5);

        Elements ele = doc.select("li.timeline__item___3bF6k");

        for(Element e : ele){
            String relatedTitle = e.select(".date-item___14w-B").text();
            String relatedContent = e.select(".content-item___2MP3j a").text();
            related.put(relatedTitle,relatedContent);
        }

        n = new News(title,content,related);

        return n;
    }
}
