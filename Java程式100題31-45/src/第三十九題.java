import java.util.Scanner;

public class �ĤT�Q�E�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�����n");
		int n = scn.nextInt();
		double a = 0;
		if (n <= 0) {
			System.out.println("�ϥΪ̿�J���~");
		} else {
			for (int i = 1; i <= n; i++) {
				a += (double) 1 / ((2 * i - 1) * (2 * i));
			}
			System.out.println("�B�⵲�G��" + a);
		}
	}

}
