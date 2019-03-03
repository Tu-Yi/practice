package com.niliv.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;



/**
 * 游戏物体父类
 * @author yuankun
 *
 */
public class GameObject {
	
	protected Image imgImage;
	protected double x,y;
	protected int speed;
	protected int width,height;
	
	public void drawSelf(Graphics g) {
		g.drawImage(imgImage, (int)x, (int)y, null);
	}

	public GameObject(Image imgImage, double x, double y, int speed, int width, int height) {
		super();
		this.imgImage = imgImage;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}

	public GameObject(Image imgImage, double x, double y) {
		super();
		this.imgImage = imgImage;
		this.x = x;
		this.y = y;
	}
	public GameObject() {}
	
	//检测物体矩形，便于碰撞检测
	public Rectangle getRect() {
		return new Rectangle((int)x,(int)y,width,height);
	}

}
