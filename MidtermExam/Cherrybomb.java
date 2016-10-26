import java.io.*;
import java.util.*;
public class Cherrybomb extends Plant implements SplashAttacker {
	
	private int turnCount = 2;
	public Cherrybomb(){
		super(10, 150, 150);
		// sunlightCost = 150;
		
	}
	public void splashAttack(List<Zombie> defenders){
		if (turnCount != 0){
			turnCount--;
		}else{
			for (Zombie a: defenders){
				a.takeDamage(150);
			}
			takeDamage(10);
		}
	}	
}