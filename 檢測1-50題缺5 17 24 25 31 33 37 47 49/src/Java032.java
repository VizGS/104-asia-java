import java.util.Scanner;

public class Java032 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int data[][] = new int[5][7];
		int data2[][] = new int[7][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				data[i][j] = scn.nextInt();
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