import java.util.Scanner;

public class Java049 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		F(n);
	}

	public static void F(int x) {
		String str = "";
		int sum = 0, count = 0;
		for (int i = 1; i < x; i++) {
			sum = 0;
			str = "" + i;
			int j = i;
			while (sum < x) {
				sum += j;
				j++;
				if (sum < x) {
					str += "+" + j;
				}
			}
			if (sum == x) {
				count++;
				System.out.println(str);
			}
		}
		if (count == 0) {
			System.out.println("No");
		}
	}
}
