import java.util.Scanner;

public class Java018 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int sum = 1, sum2 = 1, sum3 = 1;
		for (int i = 1; i <= a; i++) {
			sum *= i;
		}
		for (int j = 1; j <= b; j++) {
			sum2 *= j;
		}
		for (int k = 1; k <= (a - b); k++) {
			sum3 *= k;
		}
		System.out.println(sum / (sum2 * sum3));
	}
}