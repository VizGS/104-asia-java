import java.util.Scanner;

public class �ĤQ���D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int n = scn.nextInt();
		if (n > 0) {
			if (n % 2 == 0) {
				System.out.println("������Ƭ�����");
			} else {
				System.out.println("������Ƭ��_��");
			}
		} else {
			System.out.println("�ϥΪ̿�J���~");
		}

	}

}
