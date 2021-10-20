package lab;
import java.util.Scanner;

public class SumOfCubes {
	static int cubeSum(int n) {
		int sum = 0;
		do {
			int r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;
		} while (n != 0);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int s = cubeSum(n);
		System.out.println("The sum of cube of digits of number is: " + s);

	}

}


