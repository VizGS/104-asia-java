import java.util.Scanner;

public class �ĤG�Q���D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�T���Ϊ��T���");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if (a > b && a > c) {
			int d = a;
			a = c;
			c = d;
		} else if (b > a && b > c) {
			int d = b;
			b = c;
			c = d;
		}
		if (a + b > c) {
			if (a * a + b * b < c * c) {
				System.out.println("���T���ά��w���T����");
			} else if (a * a + b * b == c * c) {
				System.out.println("���T���ά������T����");
			} else if (a * a + b * b > c * c) {
				System.out.println("���T���ά��U���T����");
			}
		} else {
			System.out.println("���D�X�k�T����");
		}
	}

}
