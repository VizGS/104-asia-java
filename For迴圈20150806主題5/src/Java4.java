import java.util.Scanner;
public class Java4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�Z�ŤH��");
		int A=scn.nextInt();
		System.out.println("�п�J�C�ӤH���������魫");
		int B=0;
		int F=0;
		float C=0;
		float G=0;
		for(int i=1;i<=A;i++){
			int D=scn.nextInt();
			int E=scn.nextInt();
			F+=E;
			B+=D;
		}
		C=B/A;
		G=F/A;
		System.out.println("�Z�Ū����������O"+C);
		System.out.println("�Z�Ū����������O"+G);
	}

}
