/*
 * Shape Class
 * Created by Desabille, Cugal, Arsolon
 * 10/4/16
 */
public class Shape{
	private String color;
	private boolean filled;
	
	public Shape(){
		color = "green";
		filled = true;
	}

	public Shape(String color, boolean filled){
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