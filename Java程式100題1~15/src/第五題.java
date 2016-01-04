import java.util.Random;

public class 第五題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int[][] a = new int[10][10];
		System.out.println("原矩陣為:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = ran.nextInt(10) + 1;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("轉置矩陣為:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
