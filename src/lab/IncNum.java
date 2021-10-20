package lab;
import java.util.Scanner;

public class IncNum {
	static boolean isIncreasing(int n) {
		int currentDigit=n%10;
		n=n/10;
		while(n>0) {
			if(currentDigit <=n%10) {
				n=n/10;
				return false;
			}
			currentDigit=n%10;
			n=n/10;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 digit no");
		int n=sc.nextInt();
		boolean rs=isIncreasing(n);
		if(rs==true)
			System.out.println(n+" is a increasing no");
		else
			System.out.println(n+" is not a increasing no");
		
	}

}
