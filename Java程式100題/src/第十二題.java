import java.util.Scanner;

public class 第十二題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入國文、英文、數學成績");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		System.out.println("總分數為" + (a + b + c));
		System.out.println("平均成績為" + (float) ((a + b + c) / 3));
	}

}
