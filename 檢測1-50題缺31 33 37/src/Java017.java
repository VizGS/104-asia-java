import java.util.Scanner;

public class Java017 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		System.out.println(lcm1(lcm(a,b),c));
	}

	public static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
	public static int lcm1(int a, int b) {
		return a*b/gcd(a,b);
	}
	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		} else {
			return gcd(n, m % n);
		}
	}
}
