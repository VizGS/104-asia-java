import java.util.Scanner;
public class Java4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入你要傳送的訊息");
		String a=scn.nextLine();
		char b[] = a.toCharArray();
		for(int j=a.length()-1;j>=0;j--){
			System.out.print(b[j]);
		}
	}

}
