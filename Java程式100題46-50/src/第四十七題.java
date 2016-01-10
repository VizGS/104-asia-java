import java.util.Scanner;

public class 第四十七題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}

}
