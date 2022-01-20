package Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToString {
	public static void main(String[] cmd_lineParams) {
		Map<String, String> map = new HashMap<>(4);
		map.put("John", "101");
		map.put("Mike", "102");
		map.put("William", "103");
		map.put("Markel", "104");
		map.put("Vin", "105");
		String s = map.entrySet().stream()
				.map((entry) -> "" + entry.getKey() + " \"" + entry.getValue().replaceAll("\"", "\\\\\"") + "\"")
				.collect(Collectors.joining(" "));
		System.out.println(s);

	}
}
