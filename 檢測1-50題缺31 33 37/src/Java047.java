import java.util.Scanner;

public class Java047 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();
		for (int i = a.length() - 1; i >= 0; i--) {
			char b = a.charAt(i);
			System.out.print(b);
		}
	}

}
