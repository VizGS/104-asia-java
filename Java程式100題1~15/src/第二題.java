import java.util.Scanner;

public class 第二題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字串");
		String a = scn.nextLine();
		for (int i = a.length() - 1; i >= 0; i--) {
			char b = a.charAt(i);
			System.out.print(b);
		}
	}

}
