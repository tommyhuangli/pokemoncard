package boilerplate;

public class Test {

	public static void main2(String[] args) {
		System.out.println("hello. let's pause for 1 second");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After one second, I am back");
	}
	
	public static void main(String[] args) {

		int myNumber = 91;

		int stepOne = myNumber * myNumber;

		int stepTwo = stepOne + myNumber;

		int stepThree = stepTwo / myNumber;

		int stepFour = stepThree + 17;

		int stepFive = stepFour - myNumber;

		int stepSix = stepFive / 6;

		System.out.println(stepSix);
		
	}
}
