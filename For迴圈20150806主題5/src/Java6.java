import java.util.Scanner;
public class Java6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("½Ð¿é¤Jnªº­È");
		int n=scn.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("¡¹");
			}
			System.out.println();
		}
	}

}
