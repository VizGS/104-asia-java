import java.util.Scanner;
import java.util.Random;

public class Java004 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int seed = scn.nextInt();
		ran.setSeed(seed);
		int[] a = new int[6];
		for (int i = 0; i < 6; i++) {
			int b = ran.nextInt(42) + 1;
			a[i] = b;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		for (int k = 0; k < 6; k++) {
			System.out.print(a[k] + "\t");
		}
	}
}
