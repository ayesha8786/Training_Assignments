

1. Find out if the given number is an Armstrong number. Logic-if 153 is the Supplied value, then 1³+5^3+3^3=1+125+27=153.
   This is the same as supplied value hence it is an Armstrong number.
```java
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
```
Otuput:
```
153    
153.0 is an Armstrong
```

2. Find out all the Armstrong numbers falling in the range of 100-999
```java
import java.util.Scanner;

public class ArmstrongRange_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int range = sc.nextInt();
		findArmRange(num, range);
	}

	public static void findArmRange(int num, int range) {
		for (int i = num; i < range; i++) {
			int num1 = i;
			int result = 0;
			while (num1 > 0) {
				int remainder = num1 % 10;
				result = result + (remainder * remainder * remainder);
				num1 = num1 / 10;
			}
			if (result == i) {
				System.out.println(result);
			}
		}
	}
}
```
Output:
```
100
999
153 is Armstrong
370 is Armstrong
371 is Armstrong
407 is Armstrong

```
