package pokemon;

import pokemon.basic.Foongus;

public class Main {

	 
		public static void main (String[] args) {
			Foongus f1 = new Foongus();
			Foongus f2 = new Foongus();
			System.out.println("my name is Foogus, I have healthpoint of  " + f1.getHealthPoint() );
			f1.attacked(20);
			f2.attacked(60);

			f1.heal(10);
			f2.heal(100);
		}
}
