package com.niliv.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
/**
 * 飞机类
 * @author yuankun
 *
 */
public class Plane extends GameObject {
	int speed = 3;
	boolean left,up,down,right;
	boolean live = true;
	
	public void drawSelf(Graphics g) {
		
		if(live) {
			g.drawImage(imgImage, (int)x, (int)y, null);
			
			//由于在不断重绘，所以标志在不断判断，从而实现坐标的加减
			if(left) {
				x-=speed;
			}
			if(right) {
				x+=speed;
			}
			if(up) {
				y-=speed;
			}
			if(down) {
				y+=speed;
			}
		}
		
	}
	
	public Plane(Image imgImage, double x, double y, int speed, int width, int height) {
		super(imgImage, x, y, speed, width, height);
	}



	//根据键盘方向键按下事件改变方向标志
	public void addDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left=true;
			break;
		case KeyEvent.VK_UP:
			up=true;
			break;
		case KeyEvent.VK_RIGHT:
			right=true;
			break;
		case KeyEvent.VK_DOWN:
			down=true;
			break;
		default:
			break;
		}
	}
	//根据键盘方向键释放事件改变方向标志
	public void minusDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left=false;
			break;
		case KeyEvent.VK_UP:
			up=false;
			break;
		case KeyEvent.VK_RIGHT:
			right=false;
			break;
		case KeyEvent.VK_DOWN:
			down=false;
			break;
		default:
			break;
		}
	}
}
