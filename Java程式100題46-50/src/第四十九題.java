import java.util.Scanner;

public class �ĥ|�Q�E�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int a = scn.nextInt();
		System.out.println(fuck(a) + "���");
	}

	public static int fuck(int a) {
		if (a > 0 && a < 10) {
			return 1;
		} else {
			return 1 + fuck(a / 10);
		}

	}

}
