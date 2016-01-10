import java.util.Scanner;

public class Java027 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int data[] = new int[3];
		for (int i = 0; i < 3; i++) {
			data[i] = scn.nextInt();
			if (data[i] % 4 == 0 && data[i] % 100 != 0 | data[i] % 400 == 0 || data[i] == 0) {
				System.out.println("¶|¦~");
			} else {
				System.out.println("¥­¦~");
			}
		}
	}
}