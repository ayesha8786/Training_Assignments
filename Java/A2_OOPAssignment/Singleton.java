package OOP;

public class Singleton {
		   private static Singleton instance = null;
		   private Singleton() {
		      // Exists only to defeat instantiation.
		   }
		   public static Singleton getInstance() {
		      if(instance == null) {
		         instance = new Singleton();
		      }
		      return instance;
		   }
		   public void getcontactdetails()
		   {
			   System.out.println("Contact details");
		   }
		   public static void main(String[] args)
		   {
			 Singleton sing1=Singleton.getInstance();
			 System.out.println(sing1);
			 sing1.getcontactdetails();
		   }
		}



