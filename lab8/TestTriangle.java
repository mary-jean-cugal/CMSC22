
public class TestTriangle {

	public static void main(String[] args) {

		Triangle t = new Triangle(3, 4, 5);

		System.out.println(t);
		System.out.println("area: " + t.getArea());
		System.out.println("perimeter: " + t.getPerimeter());
		System.out.println("===============================");
		System.out.println();

		Triangle t1 = new Triangle(45, 23, 10);

		System.out.println(t1);
		System.out.println("area: " + t1.getArea());
		System.out.println("perimeter: " + t1.getPerimeter());
	}
}