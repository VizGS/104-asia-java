import java.util.Scanner;

public class �ĥ|�Q���D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int a = scn.nextInt();
		int b = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i);
				b++;
			}
		}
		if (b > 2) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}
