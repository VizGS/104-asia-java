import java.util.Scanner;

public class Java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J��몺�u�ɼ�");
		int a = scn.nextInt();
		System.out.println("�п�J�C�몺�T�w�~��");
		int b = scn.nextInt();
		double c;
		if (a > 120) {
			c = a * b * 1.66;
		} else if (a > 60) {
			c = a * b * 1.33;
		} else {
			c = a * b;
		}
		System.out.println("����o���~��O:" + c);
	}

}
