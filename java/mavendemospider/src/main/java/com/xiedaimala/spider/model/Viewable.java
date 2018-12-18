package com.xiedaimala.spider.model;

/**
 * 理解：展示接口，新闻对象类都必须实现此接口，从而解耦view层对model和reader的依赖
 */
public interface Viewable {
    void display();
}
