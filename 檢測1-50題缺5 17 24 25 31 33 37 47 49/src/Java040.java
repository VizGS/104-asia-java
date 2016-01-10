import java.util.Scanner;

public class Java040 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		for (int i = 1; i <= n; i++) {
			a += Math.pow(2, i);
		}
		System.out.println(a);
	}
}