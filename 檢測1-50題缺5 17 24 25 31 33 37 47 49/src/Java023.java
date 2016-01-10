import java.util.Scanner;
import java.util.Random;

public class Java023 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int seed = scn.nextInt();
		ran.setSeed(seed);
		int a[] = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = ran.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		System.out.println(a[2] + " " + a[0]);
	}
}