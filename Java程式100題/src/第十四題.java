import java.util.Scanner;

public class �ĤQ�|�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�e�M��");
		int w = scn.nextInt();
		int h = scn.nextInt();
		F(w, h);
	}

	public static void F(int w, int h) {

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}

}
