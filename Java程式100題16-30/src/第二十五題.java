import java.util.Scanner;

public class 第二十五題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
    	int b = scn.nextInt();
		int c = scn.nextInt();
		if (a > b && a > c) {
			int d = a;
			a = c;
			c = d;
		} else if (b > a && b > c) {
			int d = b;
			b = c;
			c = d;
		}
		if (a + b > c) {
			if (a * a + b * b < c * c) {
				System.out.println("Obtuse triangle");
			} else if (a * a + b * b == c * c) {
				System.out.println("Right triangle");
			} else if (a * a + b * b > c * c) {
				System.out.println("Acute triangle");
			}
		}
	}

}
