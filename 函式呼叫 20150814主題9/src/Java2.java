import java.util.Scanner;
public class Java2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入國文,英文,數學的成績");		
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		System.out.println("總和"+sum(a, b, c));
		avg(sum(a, b, c));
	}
	
	public static int sum(int d, int n, int s){
		int sum=d+n+s;
		return sum;
	}
	
	public static void avg(int r){
		float d=r/3;
		System.out.println("平均"+d);
	}
}
