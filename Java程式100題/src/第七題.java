import java.util.Scanner;

public class 第七題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字母");
		char a = scn.next().charAt(0);
		if (a > 64 && a < 91) {
			char b = (char) (a + 32);
			System.out.println("經大小寫轉換後為" + b);
		} else if (a > 96 && a < 123) {
			char c = (char) (a - 32);
			System.out.println("經大小寫轉換後為" + c);
		} else {
			System.out.println("使用者輸入錯誤");
		}
	}

}
