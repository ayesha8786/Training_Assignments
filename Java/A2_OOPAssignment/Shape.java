package OOP;

abstract class Shapes {
	abstract void draw();
}

class Line extends Shapes {
	void draw() {
		System.out.println("Drawing Line");
	}
}

class Rectangle extends Shapes {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shapes {
	void draw() {
		System.out.println("Circle");
	}
}
public class Shape{
	public static void main(String[] args) {
		Line s1 = new Line();
		s1.draw();
		Rectangle s2 = new Rectangle();
		s2.draw();
		Circle s3 = new Circle();
		s3.draw();
	}
}
