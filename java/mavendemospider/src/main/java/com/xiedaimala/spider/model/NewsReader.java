package com.xiedaimala.spider.model;

import java.io.File;

/**
 * 理解：定义新闻读取抽象类，读取新闻实现方法
 */
public abstract class NewsReader {
    protected File file;

    public NewsReader(File file) {
        this.file = file;
    }

    public abstract News readNews();
}
