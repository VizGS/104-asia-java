import java.util.Scanner;

public class �ĤT�Q�@�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�Jx����");
		double x = scn.nextDouble();
		double y;
		if (x < -1) {
			y = 3 * (double) (Math.pow(x, 2));
		} else if (x <= 1) {
			y = (double) (Math.pow(x, 3) + 3 * x - 3);
		} else {
			y = 2 * x + 3;
		}
		System.out.println("y���Ȭ�" + y);
	}

}
