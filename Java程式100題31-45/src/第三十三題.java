import java.util.Scanner;

public class �ĤT�Q�T�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ͤ骺���");
		int A = scn.nextInt();
		System.out.println("�п�J�ͤ骺���");
		int B = scn.nextInt();
		if (A == 1 && B > 20 && B < 32 || A == 2 && B < 20) {
			System.out.println("�P�y�����~�y");
		} else if (A == 2 && B > 19 && B < 32 || A == 3 && B < 21)
			System.out.println("�P�y�������y");
		else if (A == 3 && B > 20 && B < 32 || A == 4 && B < 20)
			System.out.println("�P�y���d�Ϯy");
		else if (A == 4 && B > 19 && B < 32 || A == 5 && B < 21)
			System.out.println("�P�y�������y");
		else if (A == 5 && B > 20 && B < 32 || A == 6 && B < 22)
			System.out.println("�P�y�����l�y");
		else if (A == 6 && B > 21 && B < 32 || A == 7 && B < 23)
			System.out.println("�P�y�����ɮy");
		else if (A == 7 && B > 22 && B < 32 || A == 8 && B < 23)
			System.out.println("�P�y����l�y");
		else if (A == 8 && B > 22 && B < 32 || A == 9 && B < 23)
			System.out.println("�P�y���B�k�y");
		else if (A == 9 && B > 22 && B < 32 || A == 10 && B < 24)
			System.out.println("�P�y���ѯ��y");
		else if (A == 10 && B > 23 && B < 32 || A == 11 && B < 22)
			System.out.println("�P�y�����Ȯy");
		else if (A == 11 && B > 21 && B < 32 || A == 12 && B < 21)
			System.out.println("�P�y���g��y");
		else if (A == 12 && B > 20 && B < 32 || A == 1 && B < 21)
			System.out.println("�P�y�����~�y");
	}

}
