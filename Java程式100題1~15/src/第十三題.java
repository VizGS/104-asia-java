import java.util.Scanner;

public class �ĤQ�T�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J����M�r��");
		char c = scn.next().charAt(0);
        int n = scn.nextInt();
		square(c, n);
	}

	public static void square(char c,int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
