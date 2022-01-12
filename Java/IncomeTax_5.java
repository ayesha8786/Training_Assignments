package assignment;

import java.util.Scanner;

public class IncomeTax_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ctc;
		double tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ctc ");
		ctc = sc.nextInt();
		if (ctc <= 180000) {
			tax = ctc;
			System.out.println("Slab A's " + tax + " is the display Tax Amount");
		} else if ((ctc >= 181001) && (ctc <= 300000)) {
			tax = ctc + (ctc * 10 / 100);
			System.out.println("Slab B's " + tax + " is the display Tax Amount");
		} else if ((ctc >= 300001) && (ctc <= 500000)) {
			tax = ctc + (ctc * 20 / 100);
			System.out.println("Slab C's " + tax + " is the display Tax Amount");
		} else if ((ctc >= 500001) && (ctc <= 1000000)) {
			tax = ctc + (ctc * 30 / 100);
			System.out.println("Slab D's " + tax + " is the display Tax Amount");
		} else {
			System.out.println("Wrong Input");
		}
	}

}
