import java.util.Scanner;
public class Java4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�A�n�ǰe���T��");
		String a=scn.nextLine();
		char b[] = a.toCharArray();
		for(int j=a.length()-1;j>=0;j--){
			System.out.print(b[j]);
		}
	}

}
