import java.util.Scanner;
public class Java8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scn=new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn­È");
		int a=scn.nextInt();
		System.out.println("±o"+fuck(a));
	}

	public static int fuck(int a){
		int b=0;
		for(int i=1;i<=a;i++){
			
			b+=Math.pow(2, i);
		}
		return b;
	}
}
