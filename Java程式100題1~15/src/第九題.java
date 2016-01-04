import java.util.Scanner;

public class 第九題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入性別(男/女)");
		String a = scn.next();
		System.out.println("請輸入身高");
		double b = scn.nextDouble();
		switch (a) {
		case "男":
			double c = (b - 170) * 0.6 + 62;
			System.out.println("標準體重為" + c);
			break;
		case "女":
			double d = (b - 158) * 0.5 + 52;
			System.out.println("標準體重為" + d);
			break;
		default:
			System.out.println("使用者輸入錯誤");
			break;
		}
	}

}
