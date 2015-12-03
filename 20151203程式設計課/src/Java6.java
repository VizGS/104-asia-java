import java.util.Scanner;
public class Java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入n值");
		int n=scn.nextInt();
		double a=0;
		for(int i=1;i<=n;i++){
			a+=(double)1/i;
		}
		System.out.println("計算結果為"+a);
	}

}
