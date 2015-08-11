import java.util.Scanner;
public class Java5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入n與m的值");
		int n=scn.nextInt();
		int m=scn.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				System.out.print((i*j)+"\t");
			}
			System.out.println();
		}
		
	}

}
