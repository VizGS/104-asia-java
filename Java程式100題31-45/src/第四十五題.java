import java.util.Scanner;

public class 第四十五題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n");
		int n = scn.nextInt();
		if (n <= 0) {
			System.out.println("使用者輸入錯誤");
		} else {
			for (int i = 1; i <= n; i++) {
				for (int j = n - i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k < 2 * i - 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
