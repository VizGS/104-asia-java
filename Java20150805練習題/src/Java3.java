import java.util.Scanner;
public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�T���Ϊ��T���");
		int A=scn.nextInt();
		int B=scn.nextInt();
		int C=scn.nextInt();
		if(A+B>C&&A+C>B&&C+B>A){
		System.out.println("���T����������X�k�T���");
		}else{
			System.out.println("���T����������O�X�k���T���");
		}
	}

}
