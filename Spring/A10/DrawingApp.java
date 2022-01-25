package shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("configs.xml"); 
		 * Triangle triangle = (Triangle)
		 * context.getBean("triangle"); triangle.draw();
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("configs.xml");
		PointTriangle ptriangle = (PointTriangle) context.getBean("ptriangle");
		ptriangle.pointdraw();
	}

}
