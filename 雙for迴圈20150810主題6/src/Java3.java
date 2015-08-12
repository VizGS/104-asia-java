import java.util.Scanner;
public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入圖形");
		char n = scn.next().charAt(0);
		System.out.println("請輸入高");
		int A=scn.nextInt();
		System.out.println("請輸入你要顯示的字元");
		char B = scn.next().charAt(0);
		switch (n){
		case '三' :
			for(int i=0;i<A;i++){
				for(int j=0;j<=i;j++){
					System.out.print(B);
				}
				System.out.println();
			}
			break;
		case '正':
			for(int i=0;i<A;i++){
				for(int j=0;j<A;j++){
					System.out.print(B);
				}
				System.out.println();
			}
			break;
		case '長':	
			for(int i=0;i<A;i++){
				for(int j=0;j<=A+2;j++){
					System.out.print(B);
				}
				System.out.println();
			}
			break;
			
			default:
				System.out.println("抱歉,暫不支援此圖形");
				break;
		}
	}
		

}
