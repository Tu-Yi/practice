package com.niliv.actor;

public class TvActor extends Actor implements Singable {

	public TvActor(String name,int age,String sex) {
		// TODO Auto-generated constructor stub
		super(name,age,sex);
	}
	
	@Override
	void performance() {
		
		System.out.println("我是演员"+name+"，我要表演");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("我是电视剧演员"+name+"，我也是歌手");
	}

}
