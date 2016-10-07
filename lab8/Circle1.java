/*
 * Circle1 Class extends abstract class, Shape1
 * Created by Desabille, Cugal, Arsolon
 * 10/4/16
 */
import java.lang.Math;

public class Circle1 extends Shape1 {
	protected double radius;

	public Circle1(){
		radius = 1.0;
	}

	public Circle1(double radius){
		this.radius = radius;
	}

	public Circle1(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	@Override
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter(){
		return 2.0 * Math.PI * radius;
	}

	@Override
	public String toString(){

		return "A Circle with radius = " + 
				Double.toString(radius) + 
				", which is a subclass of " + super.toString();
	}

}