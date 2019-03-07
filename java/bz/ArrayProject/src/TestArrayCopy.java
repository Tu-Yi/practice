import java.util.Arrays;

public class TestArrayCopy {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4};
		int [] brr = new int[1];
		
		//直接赋值 由于是地址传递，所以可以随意完整赋值，长度不影响赋值结果
		//brr = arr;
		
		//循环赋值 最小长度赋值
//		int arrLength = Math.min(arr.length, brr.length);
//		for(int i=0;i<arrLength;i++) {
//			brr[i] = arr[i];
//		}
		
		//使用系统方法 赋值位置和长度不能越界，否则报错
		//System.arraycopy(arr, 0, brr, 0, 4); 
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr)); 
		
	}

}
