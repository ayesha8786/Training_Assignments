package Annotations;
import java.lang.annotation.*;  
import java.lang.reflect.*;  

	@Retention (RetentionPolicy.RUNTIME)  
	@Target (ElementType.METHOD)  
	@interface Test
	{  
		String name();  
	}  

	class First 
	{
		@Test(name="Test Annotation")  
		public void test1() 
		{
			
		}  

	}
