package shapes;

public  abstract class shapes {		
		public abstract void draw();

	}
	class line extends shapes
	{
		public void draw()
		{
		System.out.println("draw line");
		}
		
	}
	class rectangle extends line
	{
		public void draw()
		{
		System.out.println("draw rectangle");
		}
		
		
	}
	class square extends rectangle
	{
		public void draw()
		{
			System.out.println("draw square.... ");
		}
		
	}
	class cube extends square
	{
		public void draw()
		{
			System.out.println("draw cube..... ");
		}
	}
