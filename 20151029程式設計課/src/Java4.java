import java.util.Scanner;

public class Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J6�Ӿ��(����1~49����)");
		int data[] = new int[6];
		int a[] = { 10, 17, 23, 03, 46, 38 };
		for (int i = 0; i < 6; i++) {
			data[i] = scn.nextInt();
			for (int k = 0; k < i; k++) {
				if (data[i] > 49 || data[i] == data[k]) {
					System.out.println("���X�����ƩάO�W�L�d��A�Э��s��J�W�@�Ӹ��X");
					i--;
				}
			}

		}
		int b = 0;
		for (int j = 0; j < 6; j++) {
			for (int k = 0; k < 6; k++) {
				if (data[j] == a[k]) {
					b++;
				}
			}
		}
		System.out.print("�A�����X��:");
		for (int i = 0; i < 6; i++) {
			System.out.print(data[i] + "  ");
		}
		if (b == 6) {
			System.out.println("���ߧA�����F!!");
		} else {
			System.out.println("�Aݢ�t�F!!");
		}

	}

}
