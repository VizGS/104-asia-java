import java.util.Scanner;
public class Java7 {

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

	public static double fuck(int a){
		double b=0;
		for(int i=1;i<=a;i++){
			b+=(1.0/((2*i-1)*(2*i)));
		}
		return (double) b;
	}
}
