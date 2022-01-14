package persistent;

import java.util.*;
public class stored {
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter persistence type");
		String persistencetype=sc.nextLine();
		filepersistence f1=new filepersistence();
		f1.persist();
		datapersistence dp=new datapersistence();
		dp.persist();
		}		
	}

