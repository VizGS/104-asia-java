import java.util.Scanner;

public class 第十六題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scn.nextInt();
		if (n > 0) {
			if (n % 2 == 0) {
				System.out.println("此正整數為偶數");
			} else {
				System.out.println("此正整數為奇數");
			}
		} else {
			System.out.println("使用者輸入錯誤");
		}

	}

}
