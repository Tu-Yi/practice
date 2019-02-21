import  java.awt.*;
import javax.swing.*;

/**
 * 
 * @author niliv
 * @version 1.0
 */
public class BallGame extends JFrame {

	int 变量 = 1;
	String $sdfString = "asfd";
	String _sdfString="asfs";
	//int 1sfd=2;
	
	
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
    
    double  x=100;    //С��ĺ�����
    double  y=100; //С���������
    //boolean  right = true;   //����
    double degree = 3.14/3;    //���ȡ��˴����ǣ�60��
    //�����ڵķ���
    public void paint(Graphics  g){
        System.out.println("���ڱ�����һ�Σ�");
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
         
        //�������±߽�
        if(y>500-40-30||y<40+40){//500�Ǵ��ڸ߶ȣ�40�����ӱ߿�30����ֱ�������һ��40�Ǳ������ĸ߶�
            degree = -degree;
        }
         
        //�������ұ߽�
        if(x<40||x>856-40-30){
            degree = 3.14 - degree;
        }
    }
    
	//���ڼ���
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);
      //�ػ�����,ÿ�뻭25��
        while(true){
            repaint(); 
            try{
                Thread.sleep(40);   //40ms,   1��=1000����.  ��Լһ�뻭25�δ���
            }catch(Exception e){
                e.printStackTrace();
            }
             
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BallGame game = new BallGame();
        game.launchFrame();
	}

}
