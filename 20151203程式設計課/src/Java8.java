import java.util.Scanner;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n值");
		int n = scn.nextInt();
		sum(n);
	}

	static void sum(int n) {
		System.out.println("1~n中可以被13整除的數值："+" ");
		int a = 0;
		for (int i = 1; i <= n; i++) {
			if(i%13==0){
				System.out.print(i+"  ");
			}
		}
		
	}
}
