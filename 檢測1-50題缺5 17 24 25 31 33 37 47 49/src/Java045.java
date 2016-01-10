import java.util.Scanner;

public class Java045 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i);
				b++;
			}
		}
		if (b > 2) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}