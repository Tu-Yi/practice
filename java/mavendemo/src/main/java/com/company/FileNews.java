package com.company;

public class FileNews extends NewsReader {

    public int a = 1;

    @Override
    public News readNews(String Path) {
        return new News("123","456");
    }

//    public FileNews(String title, String content) {
//        super(title, content);
//    }
//
//
//    public void readFromFile(String url){
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(url));
//            setTitle(reader.readLine());
//            setContent(reader.readLine());
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public String display() {
//        return getTitle() + ":" + getContent();
//    }
}
