import java.util.Scanner;

public class Java008 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = (a * 9) / 5 + 32;
		System.out.println(b);
	}
}