import java.util.Scanner;

public class �ĤQ�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�Ӧr��");
		String a = scn.next();
		boolean c = true;
		for (int i = 0; i < a.length(); i++) {
			for (int j = a.length() - (i+1);;) {
				if (a.charAt(i) == a.charAt(j)) {
					c = true;
					break;
				} else {
					c = false;
					break;
				}
			}
			if (c == false) {
				break;
			}
		}
		if (c == true) {
			System.out.println("�Ӧr��O�j��");
		} else {
			System.out.println("�Ӧr�ꤣ�O�j��");
		}
	}

}
