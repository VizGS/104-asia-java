import java.util.Scanner;
public class Java5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入x值");
		int a=scn.nextInt();
		if(a<(-1)){
		System.out.println("y值為"+java(a));		
	}else{
		if((-1)<=a&&a<=1){
			System.out.println("y值為"+java1(a));
		}else{
			System.out.println("y值為"+java2(a));
		}
	}

	}
	
	public static int java(int a){
		int y=(int) (3*Math.pow(a, 2));
		return y;
	}
	
	public static int java1(int b){
		int y=(int)Math.pow(b, 3)+3*(b)-3;
		return y;
	}
	public static int java2(int c){
		int y=2*(c)+3;
		return y;
	}
}
