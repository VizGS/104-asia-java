import java.util.Scanner;

public class 第十一題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩個整數");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println("兩數之合為" + (a + b));
		System.out.println("兩數之差為" + (a - b));
		System.out.println("兩數之積為" + (a * b));
	}

}
