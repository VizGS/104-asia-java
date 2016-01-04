import java.util.Scanner;

public class 第三十題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入六個數字");
		int data[] = new int[6];
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < 6; i++) {
			data[i] = scn.nextInt();
			if (data[i] < 0) {
				a++;
			} else {
				if (data[i] == 0) {
					b++;
				} else {
					c++;
				}
			}
		}
		System.out.println(" ");
		System.out.println("正值有" + c + "個");
		System.out.println("負值有" + a + "個");
		System.out.println("0有" + b + "個");
	}

}
