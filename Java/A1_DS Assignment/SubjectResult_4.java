package assignment;

import java.util.Scanner;

public class SubjectResult_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		if (subject1 >= 60 && subject2 >= 60 && subject3 >= 60)
			System.out.println(name + "  is Passed");
		else if ((subject1 >= 60 && subject2 >= 60) || (subject1 >= 60 && subject3 >= 60)
				|| (subject2 >= 60 && subject3 >= 60))
			System.out.println(name + "  is Passed");
		else if ((subject1 >= 60 || subject2 >= 60 || subject3 >= 60)
				|| (subject1 < 60 || subject2 < 60 || subject3 < 60))
			System.out.println(name + "  is Failed");

	}

}
