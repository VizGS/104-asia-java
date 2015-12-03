
public class Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 20, 30, 40, 50 };
		int b[] = { 1, 3, 0, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (b[i] < b[j]) {
					int c = b[i];
					b[i] = b[j];
					b[j] = c;

					int d = a[i];
					a[i] = a[j];
					a[j] = d;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "	");
		}
	}

}
