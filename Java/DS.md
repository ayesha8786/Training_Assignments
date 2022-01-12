1. Find out if the given number is an Armstrong number. Logic-if 153 is the Supplied value, then 1³+5^3+3^3=1+125+27=153.
This is the same as supplied value hence it is an Armstrong number.
package assignment;
//Amrstrong.java
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
Output
153
153.0 is an Armstrong



