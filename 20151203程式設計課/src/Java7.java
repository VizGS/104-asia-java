import java.util.Scanner;

public class Java7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�Jn��");
		int n = scn.nextInt();
		Java7_1 a = new Java7_1();
		System.out.println("�p�⵲�G��" + a.sum(n));
	}

}

class Java7_1 {
	int sum(int n) {
		int a = 0;
		for (int i = 1; i <= n; i++) {
			a += i;
		}
		return a;
	}
}
