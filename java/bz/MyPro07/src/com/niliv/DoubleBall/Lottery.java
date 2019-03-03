package com.niliv.DoubleBall;

/**
 * 开奖类
 * @author yuankun
 * @version 0.1
 */
public class Lottery {

	public Lottery() {}

	/**
	 * 计算获奖等级
	 * @param num  所买彩票号
	 * @param luckNum  当期中奖号
	 * @return
	 */
	public static int getCompareResult(Ball[] balls, Ball[] luckBalls){
		//查看自己中奖情况
		int luckLevel=0;//中奖等级1-6
		int redEqualCount=0;//红球相等数量
		boolean isBlue=false;//蓝球相等数量
		
		//将自己的彩票号与开奖号进行比较
		for(int i=0;i<balls.length;i++){
			if(i<balls.length-1){
		    //比较红球==自己买的彩票的红球号与中奖的红球号进行比较
			  Ball b=balls[i];//每遍历一次将自己的一个红球号与中奖的所有红球号进行比较
		      for(int j=0;j<luckBalls.length-1;j++){
				if(b.num==luckBalls[j].num){
					redEqualCount++;
				}
			  }	
			}else{
		    //比较蓝球==自己买的彩票的蓝球号与中奖的蓝球号进行比较
			 if(balls[balls.length-1].num==luckBalls[luckBalls.length-1].num){
				 isBlue=true;
			 }
			}
		}
		
		//得出结果
		if(redEqualCount==6&&isBlue){//一等奖  红球与蓝球都同
			luckLevel=1;			
		}else if(redEqualCount==6){//二等奖  6红同
			luckLevel=2;			
		}else if(redEqualCount==5&&isBlue){//三等奖  5红同和1蓝同
			luckLevel=3;		
		}else if((redEqualCount==5)||(redEqualCount==4&&isBlue)){//四等奖 5红同或 4红同和1蓝同
			luckLevel=4;			
		}else if((redEqualCount==4)||(redEqualCount==3&&isBlue)){//五等奖 4红同或 3红同和1蓝同
			luckLevel=5;			
		}else if(isBlue){//六等奖  蓝球同
			luckLevel=6;			
		}
		return luckLevel;
	}
}
