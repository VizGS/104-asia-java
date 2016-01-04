import java.util.Scanner;

public class 第三十八題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n");
		int n = scn.nextInt();
		int a = 0;
		if (n <= 0) {
			System.out.println("使用者輸入錯誤");
		} else {
			for (int i = 1; i <= n; i++) {
				a += i * (i + 1);
			}
			System.out.println("運算結果為" + a);
		}
	}

}
