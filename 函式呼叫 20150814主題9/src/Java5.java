import java.util.Scanner;
public class Java5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("½Ð¿é¤Jx­È");
		int a=scn.nextInt();
		if(a<-1){
		System.out.println(java(a));		
	}else{
		if(-1<=a&&a<=1){
			System.out.println(java(a));
		}else{
			System.out.println(java(a));
		}
	}

	}
	
	public static int java(int a){
		int y=3*(a^2);
		return y;
	}
	
	public static int java1(int b){
		int y=(b)^3+3*(b)-3;
		return y;
	}
	public static int java2(int c){
		int y=2*(c)+3;
		return y;
	}
}
