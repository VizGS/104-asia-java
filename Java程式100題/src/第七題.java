import java.util.Scanner;

public class �ĤC�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�Ӧr��");
		char a = scn.next().charAt(0);
		if (a > 64 && a < 91) {
			char b = (char) (a + 32);
			System.out.println("�g�j�p�g�ഫ�ᬰ" + b);
		} else if (a > 96 && a < 123) {
			char c = (char) (a - 32);
			System.out.println("�g�j�p�g�ഫ�ᬰ" + c);
		} else {
			System.out.println("�ϥΪ̿�J���~");
		}
	}

}
