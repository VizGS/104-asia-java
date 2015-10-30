import java.util.Random;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int c = 0;
		Random b = new Random();
		int cd[] = new int[20];
		for (int h = 0; h < 20; h++) {
			cd[h] = b.nextInt(100) + 1;
		}
		for (int j = 0; j < 20; j++) {
			if (cd[j] % 2 == 0) {
				a++;
			} else {
				c++;
			}
		}
		System.out.println("偶數有" + a + "個" );
		System.out.println("奇數有" + c + "個");
	}
}
