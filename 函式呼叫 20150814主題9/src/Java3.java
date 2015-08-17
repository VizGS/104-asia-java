import java.util.Scanner;
public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入2個數字");
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println(gcd(a,b));
		
		
	}
	public static int gcd(int a , int b){
		if(b>a){
			int c=a;
			a=b;
			b=c;
		}
		while (a % b != 0){ 
			int c=a%b;
			a=b;
			b=c;
		}
		return b; 
		
	}

}
