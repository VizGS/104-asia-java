import java.util.Scanner;

public class Java016 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int o = scn.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		if (m % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		if (o % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}