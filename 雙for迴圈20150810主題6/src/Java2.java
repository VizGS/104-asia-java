
public class Java2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		for(int i=0;i<4;i++){
			for(int k=0;k<3-i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int p=0;p<3;p++){
			for(int k=0;k<=p;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=4-(2*p);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
