import java.util.Random;
import java.util.Scanner;

public class 第二十一題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.println("請從1~5之間猜一個數字，看是否與電腦選的一樣");
		int n = scn.nextInt();
		int x = ran.nextInt(5) + 1;
		if (n > 5 || n < 1) {
			System.out.println("使用者輸入錯誤");
		} else {
			if (n == x) {
				System.out.println("你猜中了!");
				System.out.println("你與電腦所選的數字皆為：" + x);
			} else {
				System.out.println("你猜錯了!");
				System.out.println("你所選的數字為：" + n);
				System.out.println("電腦所選的數字為：" + x);
			}
		}

	}

}
