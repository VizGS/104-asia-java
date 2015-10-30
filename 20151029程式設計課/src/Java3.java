import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int password = 6505;
		System.out.println("請輸入密碼(四位整數)");
		int a = scn.nextInt();
		int b = 0, c = 0;
		while (b != 2) {
			if (a == password) {
				b = 2;
			} else {
				System.out.println("密碼錯誤，請再次輸入密碼");
				a = scn.nextInt();
				b++;
			}
		}
		if (a == password) {
			System.out.println("密碼符合");
		} else {
			System.out.println("密碼錯誤已達3次，系統關閉~");
		}
	}

}
