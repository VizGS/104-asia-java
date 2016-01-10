import java.util.Scanner;

public class Java001 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNextInt()) {
			// write start here
			String a = scn.next();
			int c = 0;
			for (int i = 0; i < a.length(); i++) {
				char b = a.charAt(i);
				c += (b - 48);
			}
			System.out.println(c);
		}
	}
}
