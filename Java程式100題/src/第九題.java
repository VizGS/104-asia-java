import java.util.Scanner;

public class �ĤE�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ʧO(�k/�k)");
		String a = scn.next();
		System.out.println("�п�J����");
		double b = scn.nextDouble();
		switch (a) {
		case "�k":
			double c = (b - 170) * 0.6 + 62;
			System.out.println("�з��魫��" + c);
			break;
		case "�k":
			double d = (b - 158) * 0.5 + 52;
			System.out.println("�з��魫��" + d);
			break;
		default:
			System.out.println("�ϥΪ̿�J���~");
			break;
		}
	}

}
