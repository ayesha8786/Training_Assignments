package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@interface info {
	int Authorid();

	String Author();

	String Supervisor();

	String Date();

	String Time();

	int Version();

}

@info(Authorid = 16542, Author = "Chetan Bhagat", Supervisor = "John", Date = "18-09-2005", Time = "10:00", Version = 2)
class Book {
	public static void main(String[] args) throws Exception {
		Book b = new Book();
		Class c = b.getClass();
		info f = (info) c.getAnnotation(info.class);
		System.out.println("developer id is: " + f.Authorid() + " developer name: " + f.Author() + " Supervisor name: "
				+ f.Supervisor() + " Date is: " + f.Date() + " Time is: " + f.Time() + " version:" + f.Version());

	}

}