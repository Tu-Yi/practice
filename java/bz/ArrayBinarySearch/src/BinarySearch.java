
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,13,19,21,37,56,64,75,80,88,92};
		int low=0;
		int hight=arr.length-1;
		int key=85;
		boolean flag=false;
		while (low<hight) {
			int mid = (low+hight)/2;
			if(key<arr[mid]) {
				hight = mid-1;
			}else if(key>arr[mid]) {
				low = mid+1;
			}else {
				System.out.println(mid);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(-low-1);
		}
	}

}
