import java.util.Arrays;

/**
 * 排序空格分隔的字符串
 * @author yuankun
 * @version 0.1
 */
public class StringSort {
	
	private static final String SPACE_SPLIT=" ";
	
	public static void main(String[] args) {
		
		String numString = "20 78 9 -7 88 36 29";
		System.out.println(numString);
		numString = sortString(numString);
		System.out.println(numString);
	}

	private static String sortString(String numString) {
		
		//将字符串变为字符串数组
		String[] strings = numString.split(SPACE_SPLIT);
		//字符串数组转换为数字数组
		int[] int_strings = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			int_strings[i] = Integer.parseInt(strings[i]);
		}
		//对字符串数组进行排序
		Arrays.sort(int_strings);
		//将数组变为空格分隔的字符串
		StringBuilder sBuilder = new StringBuilder();
		for (int intstring : int_strings) {
			if(intstring!=int_strings[int_strings.length-1]) {
				sBuilder.append(intstring+SPACE_SPLIT);
			}else {
				sBuilder.append(intstring);
			}
		}
		
		return sBuilder.toString();
	}
}
