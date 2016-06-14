import java.util.Scanner;
public class Java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("½Ð¿é¤Jnªº­È");
		int n=scn.nextInt();
		for(int i=0;i<n;i++){
			for(int k=0;k<n-i-1;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=2*i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
