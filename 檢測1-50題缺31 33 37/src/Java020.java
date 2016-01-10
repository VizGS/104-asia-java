import java.util.Scanner;

public class Java020 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String n = scn.nextLine();
		for (int i = 0; i < n.length(); i++) {
			char a = n.charAt(i);
			System.out.print(a + "\t");
		}
	}
}