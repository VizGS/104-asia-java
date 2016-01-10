import java.util.Scanner;

public class Java030 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int data[] = new int[6];
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < 6; i++) {
			data[i] = scn.nextInt();
			if (data[i] < 0) {
				a++;
			} else {
				if (data[i] == 0) {
					b++;
				} else {
					c++;
				}
			}
		}
		System.out.println("+ = " + c);
		System.out.println("0 = " + b);
		System.out.println("- = " + a);
	}
}