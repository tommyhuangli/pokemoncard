package pokemon.basic;

import pokemon.Attack;

public class Foongus {
	
	int healthPoint = 50;
	
	
	Attack attack = new Attack("Ram is a good \"type\"", 10, 40);
	

	public void attacked (int power) {
		healthPoint = healthPoint - power;
		if (healthPoint <=0 ) {
			System.out.println("Ooops, I am dead....");
		}
		else {
			System.out.println("I still has health point of " + healthPoint);
		}
	}
	
	public void heal (int healthPointHealed) {
		if (healthPoint <=0 ) {
			System.out.println("I am already dead...");
		}
		else {
			healthPoint = healthPoint + healthPointHealed;
			System.out.println("My current health is " + healthPoint);
		}
		
	}

	public int getHealthPoint() {
		return healthPoint;
	}
	
	
	
}
