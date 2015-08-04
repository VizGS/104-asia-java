import java.util.Scanner;
public class Java5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("阿宏你好,");
		System.out.println("請輸入車子的傾角");
		int A=scn.nextInt();
		System.out.println("請輸入兩輪的軸距");
		int B=scn.nextInt();
		System.out.println("請輸入輪胎的尺寸");
		int C=scn.nextInt();
		if(A>43&&B>130&&C==12){
		 System.out.println("是");
		}else{
			System.out.println("不是");
		
		}
	}

}
