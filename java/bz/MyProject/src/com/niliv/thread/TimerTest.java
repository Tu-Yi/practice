package com.niliv.thread;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	public static void main(String[] args) {
		Timer timer1 = new Timer();
		timer1.schedule(new MyTask(), 1000,1000);
		Calendar cal = new GregorianCalendar(2019,4,29,19,15,10);
		timer1.schedule(new MyTask(),cal.getTime() , 200);
	}
	
}

class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("hello timer");
	}
	
}