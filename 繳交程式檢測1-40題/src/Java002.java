import java.util.Scanner;

public class Java002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();
		for (int i = a.length() - 1; i >= 0; i--) {
			char b = a.charAt(i);
			System.out.println(b);
		}
	}

}
