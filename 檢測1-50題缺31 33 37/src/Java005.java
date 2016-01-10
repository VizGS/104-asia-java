import java.util.Random;
import java.util.Scanner;

public class Java005 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int seed = scn.nextInt();
		ran.setSeed(seed);
		int[][] a = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = ran.nextInt(10) + 1;
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}
	}
}
