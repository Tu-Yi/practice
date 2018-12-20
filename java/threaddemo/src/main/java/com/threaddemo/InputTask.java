package com.threaddemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author yuankun
 */
public class InputTask implements Runnable {

    private String inStr;
    private Thread t;
    private String name;
    private String filePath;

    public InputTask(String inStr,String name,String filePath) {
        this.inStr = inStr;
        this.name = name;
        this.filePath = filePath+name+".txt";
        t = new Thread(this,"thread-"+name);
        t.start();
    }

    public void run() {
        try{

            File file = new File(filePath);
            FileUtils.writeStringToFile(file,inStr,"utf-8");
            Thread.sleep(1000);

        } catch (IOException e) {

            e.printStackTrace();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread-"+name+" | complete");

    }

    public static void main(String args[]) throws InterruptedException {

        String line = null;
        int i = 0;
        String filePath = "d:\\tmp\\";

        for(;i<100;i++){
            new InputTask("test",i+"",filePath);
            Thread.sleep(1000);
        }




//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入任意字符串然后回车：");
//
//        while (sc.hasNextLine()) {
//
//            line = sc.nextLine();
//
//            i++;
//
//            if ("exit".equals(line)){
//                break;
//            }
//
//            new InputTask(line,i+"",filePath);
//        }
//        sc.close();

    }
}
