import java.util.Random;

public class �Ĥ��D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int[][] a = new int[10][10];
		System.out.println("��x�}��:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = ran.nextInt(10) + 1;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("��m�x�}��:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
