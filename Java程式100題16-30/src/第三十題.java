import java.util.Scanner;

public class �ĤT�Q�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���ӼƦr");
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
		System.out.println("���Ȧ�" + c + "��");
		System.out.println("�t�Ȧ�" + a + "��");
		System.out.println("0��" + b + "��");
	}

}
