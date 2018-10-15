package pokemon.basic;

import pokemon.Attack;

public class Lunala {
	
	int healthPoint = 160;
	int shotterShot = 40;
	
	Attack attack = new Attack ("Wings of the Moone", 130, 2);

	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	public int getShotterShot() {
		return shotterShot;
	}

	public void setShotterShot(int shotterShot) {
		this.shotterShot = shotterShot;
	}

	public Attack getAttack() {
		return attack;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	

}
