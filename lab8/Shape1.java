/*
 * abstract Shape Class
 * Created by Desabille, Cugal, Arsolon
 * 10/4/16
 */
public abstract class Shape1{
	protected String color;
	protected boolean filled;
	
	public abstract double getArea();
	public abstract double getPerimeter();

	public Shape1(){
		color = "green";
		filled = true;
	}

	public Shape1(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public String toString(){
		String fill;

		if (isFilled() == true){
			fill = "filled";
		}else{
			fill = "not filled";
		}
		
		return "A Shape with color of " + 
				color + " and " +  fill + ".";
	}

}