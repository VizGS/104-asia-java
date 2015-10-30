import java.util.Scanner;

public class Java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入整月的工時數");
		int a = scn.nextInt();
		System.out.println("請輸入每月的固定薪資");
		int b = scn.nextInt();
		double c;
		if (a > 120) {
			c = a * b * 1.66;
		} else if (a > 60) {
			c = a * b * 1.33;
		} else {
			c = a * b;
		}
		System.out.println("所獲得的薪資是:" + c);
	}

}
