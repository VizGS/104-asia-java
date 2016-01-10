import java.util.Scanner;

public class Java010 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		boolean c = true;
		for (int i = 0; i < a.length(); i++) {
			for (int j = a.length() - (i + 1);;) {
				if (a.charAt(i) == a.charAt(j)) {
					c = true;
					break;
				} else {
					c = false;
					break;
				}
			}
			if (c == false) {
				break;
			}
		}
		if (c == true) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
	}
}