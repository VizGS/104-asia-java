import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�x�Ϊ�");
		int a = scn.nextInt();
		System.out.println("�п�J�x�μe");
		int b = scn.nextInt();
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
