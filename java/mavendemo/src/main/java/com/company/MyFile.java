package com.company;

import java.io.*;


public class MyFile {

    File file = null;

    public MyFile(String filePath) throws Exception {
        file = new File(filePath);
    }

    public String readToString() throws Exception {

        FileInputStream fileInput = new FileInputStream(this.file);
        BufferedInputStream inputStream = new BufferedInputStream(fileInput);

        int size = inputStream.available();
        byte[] buffer=new byte[size];
        inputStream.read(buffer);
        inputStream.close();

        return new String(buffer);

    }

    public void writeString(String content) throws Exception{

        FileOutputStream fileOutput = new FileOutputStream(this.file);
        BufferedOutputStream outputStream = new BufferedOutputStream(fileOutput);

        outputStream.write(content.getBytes());
        outputStream.close();

    }
}

