package strings;

public class stringoperations {
	public static void main(String[] args)
	{
		String str="Java String pool refers to the collection of Strings which are stored in heap memory";
		String str1="Java String pool refers to the collection of Strings which are stored in heap memory";
		String result=str.toLowerCase();
		System.out.println(result);
		String result1=str.toUpperCase();
		System.out.println(result1);
		String result3=str.replace("a","$");
		System.out.println(result3);
		boolean result4=str.contains("collection");
		System.out.println(result4);
		if(str==str1)
		{
			System.out.println("String matches the orginal string");
			
		boolean result5=str.equalsIgnoreCase(str1);
		{
			System.out.println(result5);
		}
		
		
	}
	}
}
