import java.util.Scanner;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�Jn��");
		int n = scn.nextInt();
		sum(n);
	}

	static void sum(int n) {
		System.out.println("1~n���i�H�Q13�㰣���ƭȡG"+" ");
		int a = 0;
		for (int i = 1; i <= n; i++) {
			if(i%13==0){
				System.out.print(i+"  ");
			}
		}
		
	}
}
