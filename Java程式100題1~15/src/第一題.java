import java.util.Scanner;

public class 第一題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串數字");
		String a = scn.next();
		int c = 0;
		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);
			c += (b - 48);
		}
		System.out.println(c);
	}

}
