import java.util.Random;
import java.util.Scanner;

public class �ĤG�Q�@�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.println("�бq1~5�����q�@�ӼƦr�A�ݬO�_�P�q���諸�@��");
		int n = scn.nextInt();
		int x = ran.nextInt(5) + 1;
		if (n > 5 || n < 1) {
			System.out.println("�ϥΪ̿�J���~");
		} else {
			if (n == x) {
				System.out.println("�A�q���F!");
				System.out.println("�A�P�q���ҿ諸�Ʀr�Ҭ��G" + x);
			} else {
				System.out.println("�A�q���F!");
				System.out.println("�A�ҿ諸�Ʀr���G" + n);
				System.out.println("�q���ҿ諸�Ʀr���G" + x);
			}
		}

	}

}
