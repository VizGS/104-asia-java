import java.util.Scanner;

public class �ĤT�Q���D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�����n");
		int n = scn.nextInt();
		int a = 1;
		if (n <= 0) {
			System.out.println("�ϥΪ̿�J���~");
		} else {
			System.out.print(n + "!=");
			while (n > 0) {
				a *= n;
				n--;
			}
			System.out.print(a);
		}
	}

}
