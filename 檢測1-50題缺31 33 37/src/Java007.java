import java.util.Scanner;

public class Java007 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		char a = scn.next().charAt(0);
		if (a > 64 && a < 91) {
			char b = (char) (a + 32);
			System.out.println(b);
		} else if (a > 96 && a < 123) {
			char c = (char) (a - 32);
			System.out.println(c);
		}
	}
}