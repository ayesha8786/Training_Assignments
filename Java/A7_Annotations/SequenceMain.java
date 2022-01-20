package Annotations;

import java.lang.reflect.Method;

public class SequenceMain {
	public static void main(String[] args) {

		Sequence s = new Sequence();
		Method[] methods = s.getClass().getMethods();

		for (Method method : methods) {
			Execute exe = method.getAnnotation(Execute.class);
			if (exe != null) {
				try {
					method.invoke(s);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		}
	}

}
