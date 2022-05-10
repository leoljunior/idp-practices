package exercises;

public class Lista_1 {

	public static void main(String[] args) {

		System.out.println("Numbers from 150 to 300");
		for (int i = 150; i <= 300; i++) {
			System.out.print(i + ", ");
			if (i != 150 && i % 30 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();

		System.out.print("Sum from 1 to 1000: ");
		int sum = 0;
		for (int i = 0; i <= 1000; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		System.out.println();

		System.out.print("Multiples of 3 between 1 and 100: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println();

		System.out.print("Factorial of 20: ");
		long fatorial = 1;

		for (int i = 1; i <= 20; i++) {
			fatorial *= i;
		}
		System.out.println(fatorial);
		System.out.println();
		System.out.println();

		System.out.print("Fibonacci up to 100: ");
		for (int i = 0; i < 30; i++) {
			System.out.print(fib(i) + ", ");
		}
		System.out.println();
		System.out.println();

		System.out.print("new variable according to the rule: ");
		int variable = 13;
		while (variable != 1) {
			if (variable % 2 == 0) {
				variable /= 2;
				System.out.print(variable + ", ");
			} else {
				variable = 3 * variable + 1;
				System.out.print(variable + ", ");
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("Chained for: ");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " ");
			for (int l = 1; l < 10; l++) {
				if (i > l) {
					System.out.print(i * (l + 1) + " ");
				} else {
					System.out.println();
					break;
				}
			}
		}
		System.out.println();
		System.out.println();
		
		
		

	}

	static long fib(int n) {
		return (n < 2) ? n : fib(n - 1) + fib(n - 2);
	}
}
