import java.util.Random;

public class �ĥ|�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int[] a = new int[6];
		for (int i = 0; i < 6; i++) {
			int b = ran.nextInt(42) + 1;
			a[i] = b;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("�ֳz���X��:");
		for (int k = 0; k < 6; k++) {
			System.out.print(a[k] + "  ");
		}
	}

}
