package com.niliv.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JFrame;

/**
 * 游戏主方法类
 * @author yuankun
 *
 */
public class MyGameFrame extends Frame {

	//获取图片
	Image bg = GameUtil.getImage("images/bg.jpg");
	Image planeImg = GameUtil.getImage("images/plane.png");
	
	//定义飞机坐标
	Plane plane = new Plane(planeImg, Constant.PLANE_X, Constant.PLANE_Y, Constant.PLANE_SPEED, planeImg.getWidth(null), planeImg.getHeight(null));
	Shell shell = new Shell();
	Shell[] shells = new Shell[Constant.SHELL_NUMBER];
	Explode baoExplode;
	Date startTimeDate = new Date();
	Date endTimDate;
	int period;
	
	
	//绘制窗口
	public void paint(Graphics g) {
		
		Color c = g.getColor();
		
		//绘制背景
		g.drawImage(bg, 0, 0, null);
		//绘制飞机
		plane.drawSelf(g);
		//绘制炸弹
		for(int i=0;i<shells.length;i++) {
			shells[i].draw(g);
			//矩形相交
			boolean peng = shells[i].getRect().intersects(plane.getRect());
			//如果相交，不显示飞机，显示炸弹动画
			if(peng) {
				plane.live=false;
				if(baoExplode==null) {
					baoExplode = new Explode(plane.x, plane.y);
					endTimDate = new Date();
					period = (int)((endTimDate.getTime()-startTimeDate.getTime())/1000);
				}
				baoExplode.draw(g);
			}
			//显示游戏时间信息
			if(!plane.live) {
				g.setColor(Color.red);
				Font font = new Font("宋体",Font.BOLD,20);
				g.setFont(font);
				g.drawString("游戏时间："+period+"秒", (Constant.GAME_WIDTH/2-50), (Constant.GAME_HEIGHT/2));
			}
		}
		
		g.setColor(c);
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
	
	//鼠标按下释放事件
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
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(Constant.GAME_X, Constant.GAME_Y);
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
		
		for(int i=0;i<shells.length;i++) {
			shells[i] = new Shell();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGameFrame frame = new MyGameFrame();
		frame.launchFrame();
	}
	
	//防止窗体抖动
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  

}
