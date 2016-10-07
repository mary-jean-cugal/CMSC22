import java.lang.*;

public class Triangle extends Shape1{
	private double side1;
	private double side2;
	private double side3;


	public Triangle(double s1, double s2, double s3) {
		if (isValid(s1, s2, s3)) {
			side1 = s1;
			side2 = s2;
			side3 = s3;
		} else {
			throw new IllegalArgumentException("invalid sides!");
		}
	}

	public boolean isValid(double a, double b, double c) {
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			return true;
		}
		return false;
	}
   
   	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public double getArea() {
		double p = (getPerimeter()) / 2.0;
		double ans = p * (p - side1) * (p - side2) * (p - side3);
		return Math.sqrt(ans);
	}

	@Override
	public String toString() {
		return "A Triangle with valid sides " + Double.toString(side1) + " , " +
				Double.toString(side2) + " and " + Double.toString(side3);
	}

}