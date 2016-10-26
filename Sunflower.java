  
public class Sunflower extends Plant implements Producer{
	int sunlightCost;
	int sunlightGive;
	public Sunflower(){
		super(50, 0, 50);
	}

	@Override
	public int produce(){
		return 100;
	}
}