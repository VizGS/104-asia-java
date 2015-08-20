import java.util.Scanner;
public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int x=0;
		int b=0;
		while(b<600){
			System.out.println("請輸入龍眼樹的重量");
			int a=scn.nextInt();
			b=b+a;
			x++;
		}
		System.out.println("共採了"+x+"棵龍眼樹");
	}

}
