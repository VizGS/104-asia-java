import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int password = 6505;
		System.out.println("�п�J�K�X(�|����)");
		int a = scn.nextInt();
		int b = 0, c = 0;
		while (b != 2) {
			if (a == password) {
				b = 2;
			} else {
				System.out.println("�K�X���~�A�ЦA����J�K�X");
				a = scn.nextInt();
				b++;
			}
		}
		if (a == password) {
			System.out.println("�K�X�ŦX");
		} else {
			System.out.println("�K�X���~�w�F3���A�t������~");
		}
	}

}
