import java.util.Scanner;
public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三角形的三邊長");
		int A=scn.nextInt();
		int B=scn.nextInt();
		int C=scn.nextInt();
		if(A+B>C&&A+C>B&&C+B>A){
		System.out.println("此三角形邊長為合法三邊長");
		}else{
			System.out.println("此三角形邊長不是合法的三邊長");
		}
	}

}
