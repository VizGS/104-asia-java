import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入矩形長");
		int a = scn.nextInt();
		System.out.println("請輸入矩形寬");
		int b = scn.nextInt();
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
