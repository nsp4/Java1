package lab;

public class Fibonacci1 {
	static void Fibonacci(int num) {
		int n1 = 0, n2 = 1;
		int counter = 0;
		while (counter < num) {
			System.out.print(n1 + " ");
			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			counter = counter + 1;
		}
	}

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String args[]) {
		int num = 10;
		Fibonacci(num);
		System.out.println();
		System.out.println("Using recursion :- ");
		for (int i = 0; i < num; i++) {
			System.out.print(fib(i) + " ");
		}
	}
}


