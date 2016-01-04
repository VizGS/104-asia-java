import java.util.Scanner;

public class 第三十四題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入單月使用分鐘數");
		int a = scn.nextInt();
		double b = 0;
		if (a > 1200) {
			b = 0.5 * a * 0.79;
		} else if (a > 600) {
			b = 0.5 * a * 0.9;
		} else {
			b = 0.5 * a;
		}
		System.out.println(b + "元");
	}

}
