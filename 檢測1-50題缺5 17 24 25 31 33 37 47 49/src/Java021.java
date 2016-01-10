import java.util.Scanner;
import java.util.Random;

public class Java021 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int seed = scn.nextInt();
		ran.setSeed(seed);
		int n = scn.nextInt();
		int x = ran.nextInt(5) + 1;
		if (n == x) {
			System.out.println("True " + x);
		} else {
			System.out.println("False " + x);
		}
	}
}
