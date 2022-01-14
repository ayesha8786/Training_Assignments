package strings;

import java.lang.String;

public class string_builder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("StringBuffer");
		sb.append(", is a peer class of string");

		sb.insert(6, "_");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
