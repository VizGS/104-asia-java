import java.util.Scanner;

public class �ĥ|�Q�G�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�����n");
		int n = scn.nextInt();
		if (n <= 0) {
			System.out.println("�ϥΪ̿�J���~");
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
