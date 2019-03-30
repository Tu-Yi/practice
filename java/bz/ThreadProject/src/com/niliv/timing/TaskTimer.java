package com.niliv.timing;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/**
 * 定时任务，每日18.10分执行任务
 * @author yuankun
 *
 */
public class TaskTimer {
	public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start:" + getCurrentTime());
        startTimer();
    }

    public static void startTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task begin:" + "(*^__^*) 嘻嘻，我又来了！！"+ getCurrentTime());
                try {
                    Thread.sleep(1000 * 20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("task   end:" + "(*^__^*) 嘻嘻，我又来了！！"+ getCurrentTime());
            }
        };
        Timer timer = new Timer();
        //task firsttime period
        timer.schedule(task, buildTime(), 1000 * 60 * 60 * 24);
    }

    private static Date buildTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 18);
        calendar.set(Calendar.MINUTE, 10);
        calendar.set(Calendar.SECOND, 0);
        Date time = calendar.getTime();
        if (time.before(new Date())) {
            time = addDay(time, 1);
        }
        return time;
    }

    private static Date addDay(Date date, int days) {
        Calendar startDT = Calendar.getInstance();
        startDT.setTime(date);
        startDT.add(Calendar.DAY_OF_MONTH, days);
        return startDT.getTime();
    }
}
