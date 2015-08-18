import java.util.Scanner;
public class Java5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入x,y,z的值");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		if(c>b){
			int e=c;
			c=b;
			b=e;
		}
		if(b>a){
			int d=a;
			a=b;
			b=d;
		}
		System.out.println("三數之最大公因數為"+fuck(fuck(a,b),c));
	}

	public static int fuck(int a,int b){
		if(a%b==0){
			return b;
		}else{
			int c=a%b;
			return fuck( a=b, b=c);
		}	
		
	}
}
