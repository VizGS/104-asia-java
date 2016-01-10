import java.util.Scanner;

public class Java034 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		double b = 0;
		if (a >= 1200) {
			b = 0.5 * a * 0.79;
		} else if (a >= 600) {
			b = 0.5 * a * 0.9;
		} else {
			b = 0.5 * a;
		}
		System.out.println(b);
	}
}