import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�Jx��y����");
		int x = scn.nextInt();
		int y = scn.nextInt();
		if (x < y) {
			System.out.println("x<y");
		} else if (x > y) {
			System.out.println("x>y");
		} else {
			System.out.println("x=y");
		}
		System.out.println("�п�ܹB��Ÿ�+,-,*,/");
		char a = scn.next().charAt(0);
		switch (a) {
		case '+':
			int b = x + y;
			System.out.println("x+y=" + b);
			break;
		case '-':
			int c = x - y;
			System.out.println("x-y=" + c);
			break;
		case '*':
			int d = x * y;
			System.out.println("x*y=" + d);
			break;
		case '/':
			int e = x / y;
			System.out.println("x/y=" + e);
			break;
		default:
			System.out.println("�ϥΪ̿�J���~");
			break;
		}

	}

}
