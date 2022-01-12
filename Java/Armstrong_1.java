package assignment;
import java.util.Scanner;
import java.math.*;
public class Armstrong_1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		    int number=sc.nextInt();
		    int temp=number;
		    int remainder;
			double result=0;
		    while(number > 0)
	        { 
	            remainder = number % 10;
	            result= result +Math.pow(remainder,3);
	            number = number / 10;
	        }
	        // Check for Armstrong number 
	        if(temp == result)
	        	System.out.println(result + " is an Armstrong");
	        else
	        	System.out.println(result + " is not an Armstrong");
	    }
	
}

