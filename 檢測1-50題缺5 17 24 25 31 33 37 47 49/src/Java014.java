import java.util.Scanner;

public class Java014 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt();
		int h = scn.nextInt();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
}