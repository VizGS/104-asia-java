import java.util.Scanner;

public class �Ĥ��D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�Ӧr��");
		char a = scn.next().charAt(0);
		if (a > 64 && a < 91) {
			System.out.println("�Ӧr�����j�g");
		} else if (a > 96 && a < 123) {
			System.out.println("�Ӧr�����p�g");
		} else {
			System.out.println("�Ӧr������L�r��");
		}
	}

}
