package assignment;

import java.util.Scanner;

public class ArmstrongRange_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int range=sc.nextInt();
		findArmRange(num,range);
	}

	public static void findArmRange(int num, int range) {
		for(int i=num;i<range;i++) {
			int num1=i;
			int result=0;
			while(num1>0) {
				int remainder = num1%10;
				result = result+(remainder*remainder*remainder);
				num1=num1/10;
			}
			if(result==i) {
				System.out.println(result);
			}
			
		}
		
	}
	

}
