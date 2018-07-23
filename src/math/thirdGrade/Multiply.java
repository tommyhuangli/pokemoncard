package math.thirdGrade;

import java.util.Random;

public class Multiply {


	public static void main(String[] args) {
//		System.out.println("Good moring, This is Charlie!");
//		int a = 23423423;
//		int b = 34;
//		long c = a / b;
//		long curtime = System.currentTimeMillis();
//		for (int i=1; i<967999889; i++) {
//			System.out.println("I hate youm  " + i);
//		}
//		System.out.println(String.format("It took %s seconds", (System.currentTimeMillis() - curtime) / 1000 ));
//
//	
//	
		String defend = "defend";
		String shoot = "shoot";
		String load = "load";
		String[] choice = {defend, shoot, load};
		
		Random r = new Random();
		while (true) {
			try {
				Thread.sleep(1000);
				int n = r.nextInt();
				System.out.println(choice[Math.abs(n % 3)]);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
		}
	}
}
