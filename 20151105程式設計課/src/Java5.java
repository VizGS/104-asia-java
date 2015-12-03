import java.util.Scanner;

public class Java5 {

	public static void main(String[] argv) {
		// TODO Auto-generated method stub

		System.out.println("輸入個數的數值從小到大排序為：");
		for (int j = 0; j < argv.length; j++) {
			for (int k = 0; k < j; k++) {
				if (Integer.parseInt(argv[j]) < Integer.parseInt(argv[k])) {
					String a = argv[j];
					argv[j] = argv[k];
					argv[k] = a;
				}
			}
		}
		for (int i = 0; i < argv.length; i++) {
			System.out.println(argv[i]);
		}
	}

}
