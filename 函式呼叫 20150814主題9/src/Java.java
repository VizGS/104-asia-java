import java.util.Scanner;
public class Java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�@��Ʀr");
		int b=scn.nextInt();
		int d;
		d=java(b);
		System.out.println("��M��"+d);
	}
	public static int java(int c){
		int e=0;
		while(c>0){
			 e+=c%10;
			 c=c/10;
		}
		return e;
		
	}

}
