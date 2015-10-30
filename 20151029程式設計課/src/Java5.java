import java.util.Scanner;

public class Java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("數學公式x+1/n + x+2/n-1 + ... + x+n/1");
		System.out.println("請輸入x及n的值");
		double x = scn.nextDouble();
		double n = scn.nextDouble();
		double a = 0;
		for (int i = 0; i < n; i++) {
			a += ((x + 1 + i) / (n - i));
		}
		System.out.println(a);
	}

}
