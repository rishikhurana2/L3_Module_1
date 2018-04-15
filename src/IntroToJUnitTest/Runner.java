package IntroToJUnitTest;

public class Runner {
	String multiply(int one, int two) {
		return(one + " x " + two + " = " + Math.multiplyExact(one, two));
	}
	boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				return false;
			} 
		} return true;
	}
	boolean isSquare(int num) {
		for (int i = -1; i < num; i++)
			if (Math.sqrt(num)%i == 0) {
				return true;
			}
		return false;
	}
	boolean isCube(int num) {
		for (int i = -1; i < num; i++) {
			if (Math.cbrt(num)%i == 0) {
				return true;
			}
		} return false;
	}
}
