import java.util.Scanner;

public class 第十五題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身高(cm)和體重(kg)");
		double a = scn.nextDouble();
		double b = scn.nextDouble();
		System.out.println("身高(吋)為" + (float) (a / 2.54));
		System.out.println("體重(磅)為" + (float) (b / 0.454));
	}

}
