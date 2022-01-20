package strings;

import java.lang.String;

public class stringbufferappend {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer result = sb.append("String Buffer");
		sb.append(",");
		sb.append("is a peer class of String");
		sb.append(",");
		sb.append("that provides much of");
		sb.append(",");
		sb.append("the functionality of strings");
		System.out.println(result);

	}
}
