import java.util.Scanner;

public class Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入性別");
		String a = scn.next();
		System.out.println("請輸入身高");
		int b = scn.nextInt();
		if (a.equals("男") || a.equals("男性")) {
			double c = (b - 80) * 0.7;
			System.out.println("男生標準體重為:" + c);
		} else if (a.equals("女") || a.equals("女性")) {
			double c = (b - 70) * 0.6;
			System.out.println("女生標準體重為:" + c);
		} else {
			System.out.println("使用者輸入錯誤");
		}
	}

}
