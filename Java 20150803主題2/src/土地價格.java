import java.util.Scanner;
public class 土地價格 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入土地的平方公尺數");
		float A=scn.nextFloat();
		double V=A*0.3025*18000;
		System.out.println("土地價格為"+V+"元");

	}

}
