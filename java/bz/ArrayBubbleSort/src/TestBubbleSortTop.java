import java.util.Arrays;

/**
 * 冒泡排序
 * @author yuankun
 * @version 0.1
 */
public class TestBubbleSortTop {

	public static void main(String[] args) {

		int[] arr = {75,87,56,45,49};
		int temp; //存放临时变量
		int count=0; //存放执行次数
		boolean flag; //判断这次循环有没有数据交换，如果没有，说明顺序已排好，退出排序
		for(int i=0;i<arr.length-1;i++) {
			count++;
			flag=true;
			//对无序数据进行交换判断
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=false;
				}
			}
			//如果未发生交换则退出排序
			if(flag) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("执行了"+count+"次");
	}

}
