package strings;

import java.lang.String;

public class stringbufferinsert {

	public static void main(String[] args) {
		StringBuffer insert = new StringBuffer();
		insert.insert(0, "insert text into a  string");
		insert.insert(16, "_");
		System.out.println(insert);
	}

}
