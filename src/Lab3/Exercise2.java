package Lab3;
import java.util.Scanner;
public class Exercise2 {
	
		public String getImage(String str) {
			StringBuffer sbr2 = new StringBuffer(str);
			sbr2.append('|');
			StringBuffer sb1 = new StringBuffer(str);
			// String reverse method
			sb1.reverse();
			sbr2.append(sb1);
			return sbr2.toString();
		}

		public static void main(String[] ar) {
			Exercise2 p = new Exercise2();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the String: ");
			String str = s.next();
			System.out.println(p.getImage(str));// method call
		}

}
