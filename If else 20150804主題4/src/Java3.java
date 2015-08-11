import java.util.Scanner;
public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("阿宏你好,");
		System.out.println("請輸入女生的身高");
		int A=scn.nextInt();
		System.out.println("請輸入女生的體重");
		int B=scn.nextInt();
		if (A>165 && B<45) {
			System.out.println("黃金比例!快去追!!");
		}else{
			System.out.println("免了!甭追!!");
		
	}

}
}
