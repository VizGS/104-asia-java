import java.util.Scanner;

public class Java013 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		char c = scn.next().charAt(0);
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}