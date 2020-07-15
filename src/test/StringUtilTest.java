package test;

import org.apache.commons.lang.StringUtils;

public class StringUtilTest {

	public static void main(String[] args) {
		String str = "11";
		String str1 = "22";
		str = StringUtils.leftPad(str, 6, "a");
		str1 = StringUtils.rightPad(str1, 5, "b");
		System.out.println(str);
		System.out.println(str1);
	}
}
