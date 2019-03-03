package com.niliv.game;

import java.awt.Graphics;
import java.awt.Image;
 
/**
 * 炸弹类
 * @author yuankun
 *
 */

public class Explode {
    double x,y;
    static Image[] imgs = new Image[16];
    
    static {
        for(int i=0;i<16;i++){
            imgs[i] = GameUtil.getImage("images/explode/e"+(i+1)+".gif");
            imgs[i].getWidth(null);
        }
    }
     
    int count;
     
    //实现动画
    public void draw(Graphics g){
        if(count<=15){
            g.drawImage(imgs[count], (int)x, (int)y, null);
            count++;
        }
    }
     
    public Explode(double x,double y){
        this.x = x;
        this.y = y;
    }
}
