package assignment;
import java.util.Scanner;

public class StudentMarks_9 {

	       public static void main(String[] args) {

	             // TODO Auto-generated method stub

	             int m1,m2,m3,A=0,B=0,C=0;

	             //int total=A+B+C;

	             //double avg=total/3;

	             Scanner sc=new Scanner(System.in);
	             System.out.println("enter the marks Of m1");

	                  A=sc.nextInt();

	                  B=sc.nextInt();

	                  C=sc.nextInt();

	                  int total=A+B+C;

	                  System.out.println("Total marks: "+total);

	                  double avg=total/3;

	              System.out.println("AVerage: "+avg);

	             System.out.println("enter the marks Of m2");

	                  A=sc.nextInt();

	                  B=sc.nextInt();

	                  C=sc.nextInt();

	                  int total2=A+B+C;

	                  System.out.println("Total marks: "+total);

	                double avg2=total2/3;

	              System.out.println("AVerage: "+avg2);

	             System.out.println("enter the marks Of m3");

	           A=sc.nextInt();

	           B=sc.nextInt();

	           C=sc.nextInt();

	         int total3=A+B+C;

	           System.out.println("Total marks: "+total);

	         double avg3=total3/3;

	       System.out.println("AVerage: "+avg3);

	        int RST1,RST2,RST3,p1=0,p2=0,p3=0;

	       System.out.println("enter the marks Of m1,m2,m3 of sub A");

	       p1=sc.nextInt();

	    p2=sc.nextInt();

	    p3=sc.nextInt();

	       RST1=p1+p2+p3;

	      

	       System.out.println("Total  sub marks of A: "+RST1);

	      double avgA=RST1/3;

	      System.out.println("Average: "+avgA);

	       System.out.println("enter the marks Of m1,m2,m3 of sub B");

	       p1=sc.nextInt();

	    p2=sc.nextInt();

	    p3=sc.nextInt();

	       RST2 =p1+p2+p3;

	       System.out.println("Total  sub marks of B: "+RST2);

	       double avgB=RST2/3;

	       System.out.println("Average: "+avgB);

	       System.out.println("enter the marks Of m1,m2,m3 of sub C");

	       p1=sc.nextInt();

	    p2=sc.nextInt();

	    p3=sc.nextInt();

	     RST3=p1+p2+p3;

	       System.out.println("Total  sub marks of C: "+RST3);

	       double avgC=RST3/3;

	       System.out.println("Average: "+avgC);
	       
	       }
	
}
