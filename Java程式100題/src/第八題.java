import java.util.Scanner;

public class 第八題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入攝氏溫度");
		int a = scn.nextInt();
		float b = (a * 9) / 5 + 32;
		System.out.println("華氏溫度為" + b);
	}

}
