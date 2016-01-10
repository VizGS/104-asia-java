import java.util.Scanner;

public class Java003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String n = scn.next();
    	int a[] = { 1272636, 39412201, 94586356 };
		int x = 0;
		for (int i = 0; i < 3; i++) {
			String str = String.format("%08d", a[i]).replace(" ", "0");
			for (int j = 7; j >= 0; j--) {
				if (n.charAt(i) == str.charAt(i)) {
					x++;
				} else {
					break;
				}
			}
			if (x == 3) {
				System.out.println("200");
			} else if (x == 4) {
				System.out.println("1000");
			} else if (x == 5) {
				System.out.println("4000");
			} else if (x == 6) {
				System.out.println("10000");
			} else if (x == 7) {
				System.out.println("40000");
			} else if (x == 8) {
				System.out.println("200000");
			} else {
				System.out.println("0");
			}
			x = 0;
		}
	}

}
