import java.util.Arrays;

public class TestBubbleSort {
	public static void main(String[] args) {
		int[] arr = {75,87,56,45,49};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr)); //[45, 49, 56, 75, 87]
	}
}
