import java.util.Scanner;
public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int a=scn.nextInt();
		System.out.println(fuck(a)+"位數");
	}

	public static int fuck(int a){
		if(a>0&&a<10){
			return 1;
		}else{
			return 1+fuck(a/10);	
		}
		
	}
}
