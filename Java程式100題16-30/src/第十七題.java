import java.util.Scanner;

public class 第十七題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入x,y,z的值");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		System.out.println(lcm1(lcm(a, b), c));
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static int lcm1(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		} else {
			return gcd(n, m % n);
		}
	}

}
