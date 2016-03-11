import java.util.Scanner;

public class Java003 {

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int data[][] = new int[a][a];
		int count = 1;
		int j = 0;
		int k = 0;
		int f = a - 1;
		for (int i = 0; i < 2 * a - 1; i++) {
			if (a % 2 != 0) {
				if (i < a) {
					if (i % 2 != 0) {
						j = 0;
					}
					for (int t = 0; t <= i; t++) {
						k = i - j;
						data[k][j] = count;
						count++;
						if (i % 2 != 0) {
							j++;
						} else {
							j--;
						}
					}
				} else {
					for (int t = 0; t < f; t++) {
						if (i % 2 == 0) {
							k = i - j;
						} else {
							j = i - k;
						}
						data[k][j] = count;
						count++;
						if (i % 2 == 0) {
							j--;
						} else {
							k--;
						}
					}
					f--;
				}
			} else {
				if (i < a) {
					if (i % 2 != 0) {
						j = 0;
					}
					for (int t = 0; t <= i; t++) {
						k = i - j;
						data[k][j] = count;
						count++;
						if (i % 2 != 0) {
							j++;
						} else {
							j--;
						}
					}
				} else {
					if (i % 2 == 0) {
						j = a - 1;
					} else {
						k = a - 1;
					}
					for (int t = 0; t < f; t++) {
						if (i % 2 == 0) {
							k = i - j;
						} else {
							j = i - k;
						}
						data[k][j] = count;
						count++;
						if (i % 2 == 0) {
							j--;
						} else {
							k--;
						}
					}
					f--;
				}
			}
		}

		for (int x = 0; x < a; x++) {
			for (int y = 0; y < a; y++) {
				System.out.print(data[x][y] + "\t");
			}
			System.out.println();
		}
	}
}