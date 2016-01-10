import java.util.Scanner;

public class Java039 {
	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double a = 0;
		for (int i = 1; i <= n; i++) {
			a += (double) 1 / ((2 * i - 1) * (2 * i));
		}
		System.out.println(a);
	}
}