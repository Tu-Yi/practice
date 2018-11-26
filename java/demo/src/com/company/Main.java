package com.company;

public class Main {


	public static void main(String[] args) {


	    News news = new News();
	    news.read("d://input.txt");
        System.out.println(news.display());





	    // 复制文件
//        String filePath = "d://input.txt" ;
//
//        System.out.println("12" + 12);
//
//
//
//
//        String filePath2 = "d://output.txt" ;

//        try {
//            MyFile file = new MyFile(filePath);
//            String str = file.readToString();
//            System.out.println(str);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        try {
//            MyFile file = new MyFile(filePath2);
//            file.writeString("i am a pig");
//        }catch (Exception e){
//            e.printStackTrace();
//        }


        // 字节流
        //FileHelper.copyFile(filePath,filePath2);


        // 字符流
        //FileHelper.copyFileReader(filePath,filePath2);

        // uti
        //FileHelper.copyFileUtils(filePath,filePath2);

        //FileHelper.writeStringtoFiles(filePath,"i am kitty");

        //FileHelper.copyFile1(filePath,filePath2);

//	    String filePath1 = "d:\\input.txt";
//	    String filePath2 = "d:\\output.txt";
//	    FileHelper.copyFile(filePath1,filePath2)

        // 按文件名找文件
//        System.out.println("--- start ----");
//        File file = new File("f://");
//        String[] list = file.list(new DirFilter());
//        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER); //忽略字符串大小写进行字典排序
//        for(String l:list){
//            System.out.println(l);
//        }
//        System.out.println("--- finish ----");


	}

}

