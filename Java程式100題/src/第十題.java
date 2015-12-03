import java.util.Scanner;

public class 第十題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字串");
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
			System.out.println("該字串是迴文");
		} else {
			System.out.println("該字串不是迴文");
		}
	}

}
