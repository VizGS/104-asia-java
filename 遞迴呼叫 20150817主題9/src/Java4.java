import java.util.Scanner;
public class Java4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入x,y的值");
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(b>a){
			int c=a;
			a=b;
			b=c;
		}
		System.out.println("兩數之最大公因數為"+fuck(a,b));
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
