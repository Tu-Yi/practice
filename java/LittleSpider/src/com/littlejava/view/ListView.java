package com.littlejava.view;

import com.littlejava.model.News;
import com.littlejava.model.Viewable;

import java.util.ArrayList;

/**
 * 新闻展示类
 * @author yuankun
 */
public class ListView implements Viewable {

    private ArrayList<Viewable> viewables;

    public ListView(ArrayList<Viewable> viewables) {
        this.viewables = viewables;
    }

    @Override
    public void display(){
        for(Viewable n : viewables){
            System.out.println("--------------------------------------------------");
            n.display();
        }
    }
}
