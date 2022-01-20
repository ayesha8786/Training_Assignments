package Lambda;

import java.util.ArrayList;
import java.util.List;

public class ThreadList {
	public static void main(String[] args) {

		List<Integer> num = new ArrayList<Integer>() {
			{
				add(100);
				add(200);
				add(250);
				add(300);
				add(350);
			}
		};

		Thread mylambda = new Thread(() -> System.out.println(num));
		mylambda.run();

	}

}
