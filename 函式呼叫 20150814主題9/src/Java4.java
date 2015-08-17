import java.util.Scanner;
public class Java4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入3個數字");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		System.out.println(gcd(gcd(a,b),c));
	}
	
	public static int gcd(int e,int f){

		if(f>e){
			int h=e;
			e=f;
			f=h;
		}
		while(e%f!=0){
			int h=e%f;
			e=f;
			f=h;
		}

		return f;
	}

}
