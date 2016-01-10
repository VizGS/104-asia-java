import java.util.Scanner;

public class Java035 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 1;
		for (int i = 1; i <= n; i++) {
			a *= i;
		}
		System.out.println(a);
	}
}