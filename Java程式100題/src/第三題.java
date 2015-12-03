import java.util.Scanner;

public class 第三題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入統一發票號碼(共八碼)：");
		String n = scn.next();
		String a = "01272636", b = "39412201", c = "94586356";
		int x = 0, y = 0, z = 0;
		for (int i = 7; i >= 0; i--) {
			if (n.charAt(i) == a.charAt(i)) {
				x++;
			} else {
				break;
			}
		}
		for (int j = 7; j >= 0; j--) {
			if (n.charAt(j) == b.charAt(j)) {
				y++;
			} else {
				break;
			}
		}
		for (int k = 7; k >= 0; k--) {
			if (n.charAt(k) == c.charAt(k)) {
				z++;
			} else {
				break;
			}
		}

		if (x == 3 || y == 3 || z == 3) {
			System.out.println("中獎獎金為200元");
		} else if (x == 4 || y == 4 || z == 4) {
			System.out.println("中獎獎金為1000元");
		} else if (x == 5 || y == 5 || z == 5) {
			System.out.println("中獎獎金為4000元");
		} else if (x == 6 || y == 6 || z == 6) {
			System.out.println("中獎獎金為10000元");
		} else if (x == 7 || y == 7 || z == 7) {
			System.out.println("中獎獎金為40000元");
		} else if (x == 8 || y == 8 || z == 8) {
			System.out.println("中獎獎金為200000元");
		} else {
			System.out.println("你沒中獎");
		}
	}

}
