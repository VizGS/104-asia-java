import java.util.Scanner;

public class Java036 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 1;
		while (n > 0) {
			a *= n;
			n--;
		}
		System.out.print(a);
	}
}