import java.util.*;

public class TestCircle {

	public static void main(String[] args) {

		Circle c = new Circle(3.5);
		System.out.println(c);

	    System.out.println("The radius is: " + c.getRadius());
	    System.out.println("The area is: " + c.getArea());
	    System.out.println("The perimeter is: " + c.getPerimeter());
	}
}