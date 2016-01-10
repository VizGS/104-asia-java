import java.util.Scanner;

public class Java028 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = 1000 - a;
		fuck(b);
	}

	public static void fuck(int a) {

		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int p = 0;
		if (a > 0) {
			b = a / 500;
			p = a % 500;
			if (p != 0) {
				c = p / 100;
				p = p % 100;
				if (p != 0) {
					d = p / 50;
					p = p % 50;
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
				System.out.println("500" + "\t" + b);
				System.out.println("100" + "\t" + c);
				System.out.println("50" + "\t" + d);
				System.out.println("10" + "\t" + e);
				System.out.println("5" + "\t" + f);
				System.out.println("1" + "\t" + g);
			}
		}
	}
}