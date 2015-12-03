import java.util.Scanner;

public class Java2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入年份");
		int a = scn.nextInt();

		while (a % 4 != 0 && a % 100 == 0 | a % 400 != 0 || a == 0) {
			System.out.println("此年非閏年,請再輸入年份");
			a = scn.nextInt();
		}
		System.out.println("此年為閏年");

	}

}
