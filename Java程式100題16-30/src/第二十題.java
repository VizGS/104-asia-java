import java.util.Scanner;

public class 第二十題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串數字");
		String n = scn.nextLine();
		decomp(n);
	}

	public static void decomp(String n) {
		for (int i = 0; i < n.length(); i++) {
			char a = n.charAt(i);
			System.out.print(a + " ");
		}
	}

}
