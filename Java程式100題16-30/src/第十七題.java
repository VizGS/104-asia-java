import java.util.Scanner;

public class 第十七題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入x,y,z的值");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int d = scn.nextInt();
		if (b > a) {
			int c = a;
			a = b;
			b = c;
		}
		System.out.println(
				(a / lcm(d, lcm(a, b))) * (b / lcm(d, lcm(a, b))) * (d / lcm(d, lcm(a, b))) * lcm(d, lcm(a, b)));
	}

	public static int lcm(int a, int b) {

		if (a % b == 0) {
			return b;
		} else {
			int c = a % b;
			return lcm(a = b, b = c);
		}
	}

}
