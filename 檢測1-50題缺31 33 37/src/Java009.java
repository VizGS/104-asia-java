import java.util.Scanner;

public class Java009 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		double b = scn.nextDouble();
		switch (a) {
		case 1:
			double c = (b - 170) * 0.6 + 62;
			System.out.println(c);
			break;
		case 2:
			double d = (b - 158) * 0.5 + 52;
			System.out.println(d);
			break;
		}
	}
}