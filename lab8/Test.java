
public class Test {

	public static void main(String[] args) {

		Shape1 s1 = new Circle1(5.5, "RED", false);  // Upcast Circle to Shape
		System.out.println(s1);                    // which version? -- 
		System.out.println(s1.getArea());          // which version? -- the getArea() of Circle1
		System.out.println(s1.getPerimeter());     // which version? -- the getPerimeter() of Circle1
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println(s1.getRadius()); // 
		   
		Circle1 c1 = (Circle1)s1;                   // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		   
		Shape1 s2 = new Shape1(); // error -- Shape1 is abstract cannot be instantiated
		   
		Shape1 s3 = new Rectangle1(1.0, 2.0, "RED", false);   // Upcast

		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		System.out.println(s3.getLength());
		   
		Rectangle1 r1 = (Rectangle1)s3;   // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength()); //error -- pls explain why guys

		Shape1 s4 = new Square1(6.6);     // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		System.out.println(s4.getSide()); //error -- pls explain why guys
		  
		// Take note that we downcast Shape1 s4 to Rectangle1, 
		//  which is a superclass of Square1, instead of Square
		Rectangle1 r2 = (Rectangle1)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getSide()); //error, Rectangle1 has no getSide() method
		System.out.println(r2.getLength());
		   
		// Downcast Rectangle1 r2 to Square1
		Square1 sq1 = (Square1)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());

	}
}