import java.util.Scanner;

public class �ĤG�Q�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@��Ʀr");
		String n = scn.nextLine();
		decomp(n);
	}

	public static void decomp(String n) {
		for (int i = 0; i < n.length(); i++) {
			char a = n.charAt(i);
			System.out.print(a + " ");
		}
	}

}
