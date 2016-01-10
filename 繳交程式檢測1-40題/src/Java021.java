import java.util.Random;
import java.util.Scanner;

public class Java021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int seed = scn.nextInt();
		ran.setSeed(seed);
		int n = scn.nextInt();
		int x = ran.nextInt(4) + 1;
		if (n == x) {
			System.out.println("True " + x);
		} else {
			System.out.println("False " + x);
		}
	}

}
