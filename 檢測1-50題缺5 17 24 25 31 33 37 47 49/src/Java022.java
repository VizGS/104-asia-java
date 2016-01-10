import java.util.Scanner;

public class Java022 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		System.out.println(fuck(a));
	}

	public static int fuck(int a) {
		if (a > 0 && a < 10) {
			return 1;
		} else {
			return 1 + fuck(a / 10);
		}
	}
}