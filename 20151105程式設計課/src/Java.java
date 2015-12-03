
public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = new int[19];
		int base = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				for (int k = 1; k <= 6; k++) {
					data[i + j + k]++;
					base++;
				}
			}
		}
		for (int point = 0; point < data.length; point++) {
			if (data[point] > 0) {
				System.out.println("헭쩧" + point + "헕ず업쾤О" + base + "ㅐㄷ" + data[point]);
			}
		}
	}

}
