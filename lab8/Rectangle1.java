/*
 * Rectangle1 Class extends an abstract class, Shape1
 * Created by Desabille, Cugal, Arsolon
 * 10/4/16
 */

public class Rectangle1 extends Shape1{
	protected double width;
	protected double length;

	public Rectangle1(){
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle1(double width, double length){
		this.width = width;
		this.length = length;

	}
	public Rectangle1(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getLength(){
		return length;
	}
	public void setLength(double length){
		this.length = length;
	}

	@Override
	public double getArea(){
		return length * width;
	}

	@Override
	public double getPerimeter(){
		return (2 * length) + (2 * width);
	}

	@Override
	public String toString(){

		return "A Rectangle with width = " + 
				Double.toString(length) + " and length = " + 
				Double.toString(width) + ", which is a subclass of " + 
				super.toString();
	}
}