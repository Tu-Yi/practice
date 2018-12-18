package com.xiedaimala.spider.view;


import com.xiedaimala.spider.model.Viewable;

import java.util.ArrayList;

/**
 * 理解：使用接口和多态，将view独立成遍历list的工具类，和model和control依赖倒转
 */
public class ListViewer {
    private ArrayList<Viewable> viewableList;

    public ListViewer(ArrayList<Viewable> viewableList) {
        this.viewableList = viewableList;
    }

    public void display() {
        for (Viewable viewableItem : viewableList) {
            System.out.println("-----------------------------------------------");
            viewableItem.display();
        }
    }
}
