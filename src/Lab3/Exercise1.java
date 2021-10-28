package Lab3;
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9')
				sum = sum + ch - 48;
		}
		System.out.println("sum of didgits in string : " + sum);
	}


}
