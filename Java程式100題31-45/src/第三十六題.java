import java.util.Scanner;

public class 第三十六題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n");
		int n = scn.nextInt();
		int a = 1;
		if (n <= 0) {
			System.out.println("使用者輸入錯誤");
		} else {
			System.out.print(n + "!=");
			while (n > 0) {
				a *= n;
				n--;
			}
			System.out.print(a);
		}
	}

}
