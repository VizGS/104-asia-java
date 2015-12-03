import java.util.Scanner;

public class 第六題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字元");
		char a = scn.next().charAt(0);
		if (a > 64 && a < 91) {
			System.out.println("該字元為大寫");
		} else if (a > 96 && a < 123) {
			System.out.println("該字元為小寫");
		} else {
			System.out.println("該字元為其他字元");
		}
	}

}
