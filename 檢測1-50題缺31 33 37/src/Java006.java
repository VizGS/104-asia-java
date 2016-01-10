import java.util.Scanner;

public class Java006 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		char a = scn.next().charAt(0);
		if (a > 64 && a < 91) {
			System.out.println("大");
		} else if (a > 96 && a < 123) {
			System.out.println("小");
		} else {
			System.out.println("其他字元");
		}
	}
}
