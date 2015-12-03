import java.util.Scanner;

public class 第十三題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入邊長和字元");
		int n = scn.nextInt();
		char c = scn.next().charAt(0);
		square(n, c);
	}

	public static void square(int n, char c) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
