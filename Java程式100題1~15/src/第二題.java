import java.util.Scanner;

public class �ĤG�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�Ӧr��");
		String a = scn.nextLine();
		for (int i = a.length() - 1; i >= 0; i--) {
			char b = a.charAt(i);
			System.out.print(b);
		}
	}

}
