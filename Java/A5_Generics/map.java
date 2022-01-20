package generics;

import java.util.HashMap;
import java.util.Map;
public class map {

	public static void main(String[] args) {
//Map<key,value>map=new HashMap<>();
		Map<Integer, Double> map = new HashMap<>();
		map.put(10, 20.5);
		map.put(30, 25.5);
		map.put(44, 32.5);
		map.put(13, 24.5);
		map.put(90, 29.5);
		map.put(140, 120.5);
		map.put(33, 85.5);
		map.put(60, 20.5);
		map.put(70, 29.5);
		map.put(19, 20.5);
		System.out.println(map);

	}

}
