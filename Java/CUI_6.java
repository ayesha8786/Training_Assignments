package assignment;
import java.util.*;
public class CUI_6 {
		public static void main(String[] args)
		{
			for(int i=1;i<=3;i++)
			{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String username=sc.nextLine();
		System.out.println("Enter Password");
		String password=sc.nextLine();
		if((username.equals("ayesha"))&&(password.equals("mypass@12")))
				 {
			       System.out.println("Welcome "+username);
			       break;//exit loop
				 }
		else
		{
			System.out.println("Enter valid detials");
		}
		
	}
			System.out.println("Contact Admin");
			System.exit(0);//terminate a program
		}
	}


