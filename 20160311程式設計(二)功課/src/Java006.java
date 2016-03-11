import java.util.Scanner;

public class Java006 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		fuck(a);
	}

	public static void fuck(int a) {

		int d = 0, e = 0, f = 0, g = 0, p = 0;
		if (a > 0) {
			d = a / 50;
			p = a % 50;
			if (p != 0) {
				e = p / 10;
				p = p % 10;
				if (p != 0) {
					f = p / 5;
					p = p % 5;
					if (p != 0) {
						g = p / 1;
					}
				}
			}
		}
		System.out.println("50" + "\t" + d);
		System.out.println("10" + "\t" + e);
		System.out.println("5" + "\t" + f);
		System.out.println("1" + "\t" + g);
	}
}