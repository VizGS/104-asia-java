import java.util.Scanner;

public class �ĥ|�Q�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�����n");
		int n = scn.nextInt();
		int a = 0;
		if (n <= 0) {
			System.out.println("�ϥΪ̿�J���~");
		} else {
			for (int i = 1; i <= n; i++) {
				a += Math.pow(2, i);
			}
			System.out.println("�B�⵲�G��" + a);
		}
	}

}
