
public class Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean a[] = new Boolean[101];
		for (int i = 1; i < a.length; i++) {
			a[i] = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && a[i] == true) {
					a[i] = false;
				}
			}
		}
		for (int k = 2; k < a.length; k++) {
			if (a[k] == true) {
				System.out.println(k);
			}
		}

	}

}
