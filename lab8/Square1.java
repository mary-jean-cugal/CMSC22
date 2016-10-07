/*
 * Circle1 Class extends abstract class, Shape1
 * Created by Desabille, Cugal, Arsolon
 * 10/4/16
 */
public class Square1 extends Rectangle1{
	
	public Square1(){
		super();
	}
	
	public Square1(double side){
		super(side, side);

	}

	public Square1(double side, String color, boolean filled){
		super(side, side, color, filled);
		
	}

	public double getSide(){
		return super.getWidth();
	}

	public void setSide(double side){
		super.setWidth(side);
		super.setLength(side);
	}

	@Override
	public void setWidth(double side){
		super.setWidth(side);
	}

	@Override
	public void setLength(double side){
		super.setLength(side);
	}

	//there is no need to override getArea() and getPerimeter()

	@Override
	public String toString(){

		return "A Square with a side = " + Double.toString(getSide()) + ", which is a subclass of " + super.toString();
	}
}