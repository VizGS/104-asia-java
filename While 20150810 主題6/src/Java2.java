import java.util.Scanner;

public class Java2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�~��");
		int a = scn.nextInt();

		while (a % 4 != 0 && a % 100 == 0 | a % 400 != 0 || a == 0) {
			System.out.println("���~�D�|�~,�ЦA��J�~��");
			a = scn.nextInt();
		}
		System.out.println("���~���|�~");

	}

}
