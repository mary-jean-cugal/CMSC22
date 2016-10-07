
public class TestSquare {

	public static void main(String[] args) {

		//no-arg constructor
		Square r = new Square();

		System.out.println(r);
		System.out.println("the side of the square is: " + r.getSide());
		System.out.println("the color is: " + r.getColor());
		System.out.println("is it filled ? " + r.isFilled());
		System.out.println("the area is: " + r.getArea());
		System.out.println("the perimeter is: " + r.getPerimeter());
		System.out.println();
		System.out.println();

		//overloaded constructor, accepts side as parameter
		Square r1 = new Square(2.0);

		System.out.println(r1);
		System.out.println("the side of the square is: " + r1.getSide());
		System.out.println("the color is: " + r1.getColor());
		System.out.println("is it filled ? " + r1.isFilled());
		System.out.println("the area is: " + r1.getArea());
		System.out.println("the perimeter is: " + r1.getPerimeter());
		System.out.println();
		System.out.println();

		//overloaded constructor, accepts side, color, and whether it is filled or not as parameters
		Square r2 = new Square(4.0, "blue", false);

		System.out.println(r2);
		System.out.println("the side of the square is: " + r2.getSide());
		System.out.println("the color is: " + r2.getColor());
		System.out.println("is it filled ? " + r2.isFilled());
		System.out.println("the area is: " + r2.getArea());
		System.out.println("the perimeter is: " + r2.getPerimeter());
		System.out.println();
		System.out.println();

		//getters and setters
		r2.setSide(34);
		System.out.println(r2);
		System.out.println("the side of the square is: " + r2.getSide()); //34.0
		System.out.println("the color is: " + r2.getColor());
		System.out.println("is it filled ? " + r2.isFilled());
		System.out.println("the area is: " + r2.getArea()); //1156.0
		System.out.println("the perimeter is: " + r2.getPerimeter()); //136.0
		System.out.println();
		System.out.println();
	}
}