package java;

public class solve {
	public static boolean isPrime(int num) {
		if (num <= 1)
		return false;

		for (int i = 2; i < num; i++) {
		if (num % i == 0) {
		return false;
		}
		}
			return true;
		}
		public static void main(String[] args) {
		// Pass the integer value to check whether it is prime or not.
		boolean f = isPrime(29);
		System.out.print(f);
		}
}