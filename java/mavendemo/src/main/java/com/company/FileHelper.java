package com.company;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.List;

public class FileHelper {

    // 复制文件内容-字节流
    public static void copyFile(String oPath,String nPath){

        FileInputStream oFile = null;
        FileOutputStream nFile = null;
        BufferedInputStream bufferedInputStream = null ;
        BufferedOutputStream bufferedOutputStream = null ;

        try{

            oFile = new FileInputStream(oPath);
            bufferedInputStream = new BufferedInputStream(oFile);

            nFile = new FileOutputStream(nPath);
            bufferedOutputStream = new BufferedOutputStream(nFile);

            byte[] array = new byte[1024];
            int length = 0;
            while ((length=bufferedInputStream.read(array))!=-1){
                bufferedOutputStream.write(array,0,length);
            }
            bufferedOutputStream.flush();

        }catch (Exception e){

            e.printStackTrace();

        }finally {

            try {
                if(bufferedOutputStream!=null)
                    bufferedOutputStream.close();
                if(bufferedInputStream!=null)
                    bufferedInputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    // 复制文件内容-字符流
    public static void copyFileReader(String oPath,String nPath){
        FileReader reader = null;
        BufferedReader bReader = null;

        FileWriter writer = null;
        BufferedWriter bWriter = null;

        try {

            reader = new FileReader(oPath);
            bReader = new BufferedReader(reader);

            writer = new FileWriter(nPath);
            bWriter = new BufferedWriter(writer);

            String result = null;
            while ((result=bReader.readLine())!=null){
                bWriter.write(result);
                bWriter.newLine();
            }

            bWriter.flush();

        }catch (Exception e){

            e.printStackTrace();

        }finally {

            try {
                if(bWriter!=null)
                    bWriter.close();
                if(bReader!=null)
                    bReader.close();
            }catch (Exception e){
                e.printStackTrace();
            }


        }
    }

    // 复制文件内容-utils
    public static void copyFileUtils(String oPath,String nPath){
        File oFile = new File(oPath);
        File nFile = new File(nPath);

        try {
            FileUtils.copyFile(oFile,nFile);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    // 字符串写入文件
    public static void writeStringtoFiles(String wPath,String content){
        File file = new File(wPath);
        try {
            FileUtils.writeStringToFile(file,content,"utf-8",true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // 复制文件内容-utils1
    public static void copyFile1(String oPath,String nPath){

        FileInputStream oFile = null;
        FileOutputStream nFile = null;
        BufferedInputStream bufferedInputStream = null ;
        BufferedOutputStream bufferedOutputStream = null ;

        try{

            oFile = new FileInputStream(oPath);
            nFile = new FileOutputStream(nPath);
            List<String> lines = IOUtils.readLines(oFile,"utf-8");
            IOUtils.writeLines(lines,IOUtils.LINE_SEPARATOR,nFile,"utf-8");

        }catch (Exception e){

            e.printStackTrace();

        }
    }

}
