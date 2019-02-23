import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 获取存款
 * @author yuankun
 *
 */
public class GetDeposit {

	public static void main(String[] args) {
		
		Scanner saScanner = new Scanner(System.in);
		String s;
		do {
			System.out.println("请输入本金：");
			s = saScanner.nextLine();
		} while (isEmpty(s) || !isNumeric(s));
		System.out.println("本金为：" + s);
		double deposit = Double.parseDouble(s);
		long hq1 = Math.round(deposit+deposit*(0.35/100));
		long hq2 = Math.round(deposit+deposit*(0.35/100)*2);
		long dq1 = Math.round(deposit+deposit+deposit*(1.5/100));
		long dq2 = Math.round(deposit+deposit*(2.1/100)*2);
		System.out.println("活期一年的本息合计为："+hq1);
		System.out.println("活期两年的本息合计为："+hq2);
		System.out.println("定期一年的本息合计为："+dq1);
		System.out.println("定期两年的本息合计为："+dq2);

	}
	//判断字符串是否为空
	public static boolean isEmpty(String str) {
        return null == str || "".equals(str.trim());
    }
	//判断是否为正数
	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("^\\d+$|^\\d+\\.\\d+$");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
	}
}
