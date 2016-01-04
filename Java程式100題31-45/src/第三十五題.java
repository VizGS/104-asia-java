import java.util.Scanner;

public class 第三十五題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n");
		int n = scn.nextInt();
		int a = 1;
		if (n <= 0) {
			System.out.println("使用者輸入錯誤");
		} else {
			for (int i = 1; i <= n; i++) {
				a *= i;
			}
			System.out.println(n + "!=" + a);
		}
	}

}
