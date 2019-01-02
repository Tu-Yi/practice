package com.company;

public class Main {


	public static void main(String[] args) throws InterruptedException {

//		int[] arr = new int[1000];
//		Random random = new Random(1000);
//		for(int i=0;i<1000;i++){
//			arr[i] = random.nextInt(1000);
//		}
//
//		SelectSort ss = new SelectSort(arr);
//		long startTime=System.currentTimeMillis();
//		ss.selectSortU();
//		long endTime=System.currentTimeMillis();
//		float excTime=(float)(endTime-startTime);
//		System.out.println("执行时间："+excTime+"s");
//		ss.display();

//		int[] arr1 = {1,2,3,4,5,6,7,8,9};
//		SplitHalfSearch shs = new SplitHalfSearch(arr1);
//		int index = shs.splitHalfSearch(8);
//		System.out.print(index);


		BinaryConversion bc = new BinaryConversion(6,2);
		String str = bc.convert();
		System.out.print(str);














	    /*

	    * 冒泡，递归，快速，二叉树，红黑树，基数排序，堆排序
        * 数组，栈，链表，队列
        * map list set
	    * */

//	    System.out.println(Boolean.parseBoolean("false"));




//	    Queue_demo q = new Queue_demo();
//	    q.enqueue(1);
//		q.enqueue(2);
//		q.enqueue(3);
//		q.enqueue(4);




//		int[] arrays = {3,2,5,4,1};
//		CardinalSort.radixSort(arrays);
//		System.out.println(Arrays.toString(arrays));





//		BinaryTree binaryTree = new BinaryTree();
//		binaryTree.createBinaryTree();
//		int height = binaryTree.getHeight();
//		System.out.println("treeHeihgt: "+height);
//		int size = binaryTree.getSize();
//		System.out.println("treeSize: "+size);






//		int[] arrays = new int[100000];
//		int num = 0;
//		for(int i=0;i<1000;i++){
//			arrays[i]=num;
//			num++;
//		}
////		Recursion re = new Recursion();
////		int max = re.findMax(arrays,0,arrays.length-1);
////		System.out.println(max);
////
////		re.bubbleSort(arrays,0,arrays.length-1);
////		System.out.println(Arrays.toString(arrays));
//
//		FastSort fs = new FastSort();
//		long startTime=System.currentTimeMillis();
//
//		//fs.quickSort(arrays,0,arrays.length-1);
//
//		fs.sort(arrays,0,arrays.length-1);


//		long endTime=System.currentTimeMillis();
//		float excTime=(float)(endTime-startTime);
//		System.out.println("执行时间："+excTime+"s");
//		//System.out.println(Arrays.toString(arrays));




//		int[] arrays = {3,2,5,4,1};
//		BubbleSort bSort = new BubbleSort();
//		bSort.arrays = arrays;
//		int num = bSort.Sort();
//		System.out.println(num);
//		System.out.println(Arrays.toString(bSort.arrays));




//		for (int i = 10000; i > 0; i--) {
//			System.out.println("Hello World!");
//			Thread.sleep(1000);
//		}




//		TwoSums sum = new TwoSums();
//		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		ArrayList<Integer> arr1 = sum.sum(arr,3);
//		System.out.println(arr1);
//
//		List<String> list = new ArrayList<>();
//		for (String a : list) {
//		}


//		Stack_demo<String> stack = new Stack_demo<>();
//		stack.push("1");
//		stack.push("2");
//
//		System.out.println(stack.pop());




//		int[] a = new int[]{4,5,9,2,6,1,8,10,3,7};
//
//		QuickSort.sort(a, 0, a.length-1);
//
//		System.out.println("排序后的结果：");
//		for(int x : a){
//			System.out.print(x+" ");
//		}


//		Solution slu = new Solution();
//		String[] s = new String[5];
//		s[0] = "()";
//		s[1] = "()[]{}";
//		s[2] = "(]";
//		s[3] = "([)]";
//		s[4] = "{[]}";
//
//		System.out.println(slu.isValidParentheses(s[0]));
//		System.out.println(slu.isValidParentheses(s[1]));
//		System.out.println(slu.isValidParentheses(s[2]));
//		System.out.println(slu.isValidParentheses(s[3]));
//		System.out.println(slu.isValidParentheses(s[4]));


//		WordCounter wCount = new WordCounter();
//		String[] s = new String[5];
//		s[0] = "asdafasfasfasfassagsg";
//		s[1] = "upoquwoqononaooafonfosdanofnoaq";
//		s[2] = "aflnvkjasoiquoirpnbnoqo";
//		s[3] = "asdfqiwrutuonbq";
//		s[4] = "qewotiuqiq[vmgpknpqejgpqwfqwmpbvqenpiqp";
//		System.out.println(wCount.count(s[0]).toString());
//		System.out.println(wCount.count(s[1]).toString());
//		System.out.println(wCount.count(s[2]).toString());
//		System.out.println(wCount.count(s[3]).toString());
//		System.out.println(wCount.count(s[4]).toString());


//		Solution slu = new Solution();
//
//		int[] a = new int[4];
//		a[0]=1;a[1]=2;a[2]=3;a[3]=4;
//
//		int[] b = new int[5];
//		b[0]=3;b[1]=5;b[2]=7;b[3]=4;b[4]=6;
//
//		System.out.println(Arrays.toString(slu.twoSum(a,3)));
//		System.out.println(Arrays.toString(slu.twoSum(a,b[1])));
//		System.out.println(Arrays.toString(slu.twoSum(a,b[2])));
//		System.out.println(Arrays.toString(slu.twoSum(a,b[3])));
//		System.out.println(Arrays.toString(slu.twoSum(a,b[4])));


//		Stack<Integer> stack = new Stack<Integer>();
//		// 压入堆栈顶部
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		//检查栈是否为空
//		stack.empty();
//		//查看栈顶对象
//		stack.peek();
//		//移除栈顶对象并返回
//		stack.pop();
//		//返回对象在堆栈中的位置
//		stack.search(2);




//		HashMap<String,String> map = new HashMap<String, String>();
//		//添加键值对或修改值
//		map.put("name","jack");
//		map.put("name","tony");
//		map.replace("name","leifeng");
//		//获取值
//		map.get("name");
//		//删除键值对
//		map.remove("age");
//		//判断是否为空
//		map.isEmpty();
//		//判断key和value是否存在
//		map.containsKey("age");
//		map.containsValue("tony");






//		Queue<Integer> queue = new LinkedList<Integer>();
//		//添加项
//		queue.offer(1);
//		queue.offer(2);
//		//返回第一个元素
//		System.out.println(queue.peek());
//		//检查是否为空
//		queue.isEmpty();
//		//删除项
//		queue.poll();




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

