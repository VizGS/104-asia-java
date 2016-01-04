import java.util.Scanner;

public class 第三十一題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入x的值");
		double x = scn.nextDouble();
		double y;
		if (x < -1) {
			y = 3 * (double) (Math.pow(x, 2));
		} else if (x <= 1) {
			y = (double) (Math.pow(x, 3) + 3 * x - 3);
		} else {
			y = 2 * x + 3;
		}
		System.out.println("y的值為" + y);
	}

}
