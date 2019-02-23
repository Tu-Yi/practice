import  java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
    
    double  x=100;    //小球的横坐标
    double  y=100; //小球的纵坐标
    //boolean  right = true;   //方向
    double degree = 3.14/3;    //弧度。此处就是：60度
    
    //画窗口的方法
    public void paint(Graphics  g){
        System.out.println("窗口被画了一次！");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);
        
//        if(right) {
//            x = x+10;
//        }else {
//            x = x-10;
//        }
//         
//        if(x>856-40-30) {
//            right = false;
//        }
//         
//        if(x<40) {
//            right = true;
//        }
		
        x  = x+ 10*Math.cos(degree);
        y  = y +10*Math.sin(degree); 
         
        //碰到上下边界
        if(y>500-40-30||y<40+40){//500是窗口高度；40是桌子边框，30是球直径；最后一个40是标题栏的高度
            degree = -degree;
        }
         
        //碰到左右边界
        if(x<40||x>856-40-30){
            degree = 3.14 - degree;
        }
    }
    
	//窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);
      //重画窗口,每秒画25次
        while(true){
            repaint(); 
            try{
                Thread.sleep(40);   //40ms,   1秒=1000毫秒.  大约一秒画25次窗口
            }catch(Exception e){
                e.printStackTrace();
            }
             
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BallGame game = new BallGame();
        BallGame.setDefaultLookAndFeelDecorated(true);
        //game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.launchFrame();
	}

}
