import java.util.Scanner;

public class Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ʧO");
		String a = scn.next();
		System.out.println("�п�J����");
		int b = scn.nextInt();
		if (a.equals("�k") || a.equals("�k��")) {
			double c = (b - 80) * 0.7;
			System.out.println("�k�ͼз��魫��:" + c);
		} else if (a.equals("�k") || a.equals("�k��")) {
			double c = (b - 70) * 0.6;
			System.out.println("�k�ͼз��魫��:" + c);
		} else {
			System.out.println("�ϥΪ̿�J���~");
		}
	}

}
