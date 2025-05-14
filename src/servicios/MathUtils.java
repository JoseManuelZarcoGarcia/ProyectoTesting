package servicios;

public class MathUtils {

	public int add(int a, int b) {
		return a + b;
	}

	public int divide(int numerator, int denominator) {
		return numerator / denominator;
	}

	public int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Negative numbers not allowed");
		}
		if (n == 0)
			return 0;
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

}
