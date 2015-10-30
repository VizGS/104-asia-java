import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¦¨ÁZ");
		int a = scn.nextInt();
		if (a < 60) {
			System.out.println("E");
		} else if (a < 70) {
			System.out.println("D");
		} else if (a < 80) {
			System.out.println("C");
		} else if (a < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
	}

}
