import java.util.Scanner;

public class �ĥ|�Q�|�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�����n");
		int n = scn.nextInt();
		if (n <= 0) {
			System.out.println("�ϥΪ̿�J���~");
		} else {
			for (int i = 1; i <= n; i++) {
				for (int j = n - i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k < i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
