import java.util.Scanner;

public class Java024 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		if (A <= B && B <= C) {
			if (A + B > C && A + C > B && C + B > A) {
				System.out.println("True");
			}
		} else {
			System.out.println("False");
		}
	}

}
