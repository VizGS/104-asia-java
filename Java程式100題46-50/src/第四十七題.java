import java.util.Scanner;

public class �ĥ|�Q�C�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}

}
