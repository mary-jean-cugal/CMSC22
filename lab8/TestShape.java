import java.util.*;

public class TestShape {

	public static void main(String[] args) {
		//constructor with no argument
		Shape s1 = new Shape();
		System.out.println();
		System.out.println(s1);
		System.out.println("The color is: " + s1.getColor());
	    System.out.println("Is it filled ? " + s1.isFilled());

	    //overloaded constructor
	    System.out.println();
	    System.out.println();
	    Shape s2 = new Shape("blue", false);
	    System.out.println(s2);
	    System.out.println("The color is: " + s2.getColor());
	    System.out.println("Is it filled ? " + s2.isFilled());

	    //using getters and setters
	    System.out.println();
	    System.out.println();
	    s2.setColor("yellow");
	    s2.setFilled(true);
	    System.out.println(s2);
	    System.out.println("The color is: " + s2.getColor());
	    System.out.println("Is it filled ? " + s2.isFilled());

	    
	}
}