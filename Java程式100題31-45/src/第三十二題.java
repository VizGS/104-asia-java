import java.util.Random;

public class 第三十二題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[][] = new int[5][7];
		int data2[][] = new int[7][5];
		Random ran = new Random();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				data[i][j] = ran.nextInt(100);
				data2[j][i] = data[i][j];
			}
		}
		for (int j = 0; j < 7; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(data2[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
