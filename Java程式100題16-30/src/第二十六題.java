import java.util.Scanner;

public class �ĤG�Q���D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���m,n");
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
