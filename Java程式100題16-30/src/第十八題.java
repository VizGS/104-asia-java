import java.util.Scanner;

public class �ĤQ�K�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J��Ӿ�ƪ���");
		int a = scn.nextInt();
		int b = scn.nextInt();
		if (b > a) {
			int c = a;
			a = b;
			b = c;
		}
		C(a, b);
	}

	public static void C(int a, int b) {
		int sum = 1, sum2 = 1;
		int x = 0;
		for (int j = 1; j <= b; j++) {
			sum2 *= j;
		}
		for (int i = a;;) {
			while (x != (a - (a - b))) {
				sum *= i;
				i--;
				x++;
			}
			break;
		}
		System.out.println("C(m,n)=" + (sum / sum2));
	}
}
