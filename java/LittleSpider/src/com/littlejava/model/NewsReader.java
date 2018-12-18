package com.littlejava.model;

import org.json.JSONException;

import java.io.File;
import java.io.IOException;

abstract class NewsReader {

    protected File file;
    protected String url;

    public NewsReader(File file) {
        this.file = file;
    }

    public NewsReader(String url) {
        this.url = url;
    }

    abstract News readNews() throws IOException, JSONException;
}
