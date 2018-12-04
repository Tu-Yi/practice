package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {


	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		System.out.println(queue.poll());
		System.out.println(queue.poll());




//		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());





//		HashMap<String,String> gender = new HashMap<String,String>();
//		gender.put("yk","male");
//		gender.put("alice","female");
//		if(gender.containsKey("yk")){
//			System.out.println(gender.get("yk"));
//		}
//		gender.put("alice","male");
//		gender.remove("alice");








//		Animal amCat = new Cat();
//		System.out.println(amCat.num);
//		//System.out.println(amCat.age);  报错
//		amCat.eat();
//		//amCat.catchMouse();  报错
//		amCat.cry();





//		Mann man = new Mann();
//		System.out.println("Mann对象的age"+"\n"+man.age);
//		Person p = new Person();
//		System.out.println("Person对象的age"+"\n"+p.age);









//		News news = new News("father","i am news");
//		news.display();
//
//		UrlNews urlNews = new UrlNews("son","i am urlnews","http://www.baidu.com");
//		urlNews.display();
//
//		News news_url = new UrlNews("father-son","i am father-son","http://www.taobao.com");
//		news_url.display(); // 调用子类display
//
//		NewsReader newsReader = new UrlNewsReader();
//		newsReader.readNews("http://www.qq.com").display();







//		Animal am = new Cat();
//		System.out.println(am.num); //10
//		System.out.println(am.age); //20
//		am.eat();  //猫吃饭
//		Animal.sleep(); //动物睡觉
//
//		Animal am1 = new Dog();
//		System.out.println(am1.num); //10
//		System.out.println(am1.age); //20
//		am1.eat();  //狗吃饭
//		Animal.sleep(); //动物睡觉


//		Displayable item  = new News("abc","123");
//		item.display();
//
//		Displayable item1 = new Video();
//		item1.display();
//		System.out.println(Displayable.a);



//		NewsReader news = new FileNews();
//		System.out.println(((FileNews)news).a);
		//news.readNews("d:\\input.txt");


//	    News news = new News("父类","content");
//        System.out.println(news.display());
//
//
//        FileNews fNews = new FileNews("子类","content");
//        fNews.readFromFile("d:\\input.txt");
//		System.out.println(fNews.display());


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

