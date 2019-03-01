package com.niliv.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class MyGameFrame extends JFrame {

	//获取图片
	Image bg = GameUtil.getImage("images/bg.jpg");
	Image planeImg = GameUtil.getImage("images/plane.png");
	
	//定义飞机坐标
	Plane plane = new Plane(planeImg,250,250);
	
	//绘制窗口
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g);
	}
	
	//开线程不断重绘窗口
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				//System.out.println("画");
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			plane.minusDirection(e);
		}
		
	}
	
	//加载窗口
	public void launchFrame() {
		this.setTitle("尚学堂学员_袁琨作品");
		this.setSize(500, 500);
		this.setLocation(300, 300);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		//开启重绘
		//这里解释了为什么要新开线程  https://fuliang.iteye.com/blog/149340
		new PaintThread().start();
		//定义键盘监听
		this.addKeyListener(new KeyMonitor());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGameFrame frame = new MyGameFrame();
		frame.launchFrame();
	}

}
