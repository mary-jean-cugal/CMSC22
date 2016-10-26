// package le2inc.plant;

// import le2inc.Character;

// import MidtermExam.Character;

/**
 * Class to generalize all types of plants.
 */

public abstract class Plant extends Character{
	private int sunlightCost;
	public Plant(int h, int d, int s){
		super(h, d);
		sunlightCost = s;
			
	}

	public int getSunlightCost(){
		return sunlightCost;
	}
}
