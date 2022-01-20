package Annotations;

import java.lang.reflect.Method;

public class Testmain {

	public static void main(String[] args) throws Exception {

		First f = new First();
		Method m = f.getClass().getMethod("test1");

		Test t = m.getAnnotation(Test.class);
		System.out.println(t.name());

	}

}
