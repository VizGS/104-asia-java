import java.util.Scanner;

public class Java038 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		for (int i = 1; i <= n; i++) {
			a += i * (i + 1);
		}
		System.out.println(a);
	}
}