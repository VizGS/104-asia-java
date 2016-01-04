import java.util.Scanner;

public class 第三十三題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入生日的月份");
		int A = scn.nextInt();
		System.out.println("請輸入生日的日期");
		int B = scn.nextInt();
		if (A == 1 && B > 20 && B < 32 || A == 2 && B < 20) {
			System.out.println("星座為水瓶座");
		} else if (A == 2 && B > 19 && B < 32 || A == 3 && B < 21)
			System.out.println("星座為雙魚座");
		else if (A == 3 && B > 20 && B < 32 || A == 4 && B < 20)
			System.out.println("星座為牡羊座");
		else if (A == 4 && B > 19 && B < 32 || A == 5 && B < 21)
			System.out.println("星座為金牛座");
		else if (A == 5 && B > 20 && B < 32 || A == 6 && B < 22)
			System.out.println("星座為雙子座");
		else if (A == 6 && B > 21 && B < 32 || A == 7 && B < 23)
			System.out.println("星座為巨蟹座");
		else if (A == 7 && B > 22 && B < 32 || A == 8 && B < 23)
			System.out.println("星座為獅子座");
		else if (A == 8 && B > 22 && B < 32 || A == 9 && B < 23)
			System.out.println("星座為處女座");
		else if (A == 9 && B > 22 && B < 32 || A == 10 && B < 24)
			System.out.println("星座為天秤座");
		else if (A == 10 && B > 23 && B < 32 || A == 11 && B < 22)
			System.out.println("星座為天蠍座");
		else if (A == 11 && B > 21 && B < 32 || A == 12 && B < 21)
			System.out.println("星座為射手座");
		else if (A == 12 && B > 20 && B < 32 || A == 1 && B < 21)
			System.out.println("星座為摩羯座");
	}

}
