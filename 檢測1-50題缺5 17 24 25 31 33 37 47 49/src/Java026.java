import java.util.Scanner;

public class Java026 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		if (n > m) {
			int a = m;
			m = n;
			n = a;
		}
		System.out.println(gcd(m, n));
	}

	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		} else {
			return gcd(n, m % n);
		}
	}
}