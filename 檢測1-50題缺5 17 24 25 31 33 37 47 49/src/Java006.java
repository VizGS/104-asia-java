import java.util.Scanner;

public class Java006 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		char a = scn.next().charAt(0);
		if (a > 64 && a < 91) {
			System.out.println("�j");
		} else if (a > 96 && a < 123) {
			System.out.println("�p");
		} else {
			System.out.println("��L�r��");
		}
	}
}
