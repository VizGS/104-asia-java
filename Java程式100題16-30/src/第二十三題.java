import java.util.Random;

public class �ĤG�Q�T�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int a[] = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = ran.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		System.out.print("�T�ӶüƬ�");
		for (int i = 0; i < 3; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		System.out.println("�T�Ƥ��̤j�Ȭ�" + a[2]);
		System.out.println("�T�Ƥ��̤p�Ȭ�" + a[0]);
	}

}
