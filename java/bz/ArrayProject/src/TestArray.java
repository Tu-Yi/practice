
public class TestArray {
	public static void main(String[] args) {
		
		//定义二维数组的三种方式
		int[][] arr = {{1,2},{3,4,5},{6}};
		int[][] brr = new int[3][];
		int[][] crr = new int[3][3];
		
		//循环二维数组
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(int[] a : arr) {
			for(int i : a) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j : arr[i]) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
