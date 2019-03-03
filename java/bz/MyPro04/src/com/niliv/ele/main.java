package com.niliv.ele;

import niliv.haha.Test;
import static java.lang.Math.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test test = new Test();
//		System.out.println(PI);
		
		Animal am = new Elephant("大象");
		Freezer fzFreezer = new Freezer("海尔");
		fzFreezer.OpenDoor();
		fzFreezer.Putin(am);
		fzFreezer.CloseDoor();
	}

}
