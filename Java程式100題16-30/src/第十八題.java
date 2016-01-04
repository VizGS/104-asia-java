import java.util.Scanner;

public class 第十八題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩個整數的值");
		int a = scn.nextInt();
		int b = scn.nextInt();
		if (b > a) {
			int c = a;
			a = b;
			b = c;
		}
		C(a, b);
	}

	public static void C(int a, int b) {
		int sum = 1, sum2 = 1, sum3 = 1;
		for (int i = 1; i <= a; i++) {
			sum *= i;
		}
		for (int i = 1; i <= b; i++) {
			sum2 *= i;
		}
		for (int i = 1; i <= (a - b); i++) {
			sum3 *= i;
		}
		System.out.println("C(m,n)=" + sum / (sum2 * sum3));
	}
}
