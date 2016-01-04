import java.util.Random;

public class 第二十七題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		int data[] = new int[3];
		for (int i = 0; i < 3; i++) {
			data[i] = ran.nextInt(3000) + 1;
			System.out.println("電腦所選的年份為：" + data[i]);
			if (data[i] % 4 == 0 && data[i] % 100 != 0 | data[i] % 400 == 0 || data[i] == 0) {
				System.out.println("此年為閏年");
			} else {
				System.out.println("此年為平年");
			}
		}

	}

}
