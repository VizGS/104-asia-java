import java.util.Scanner;
public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�ϧ�");
		char n = scn.next().charAt(0);
		System.out.println("�п�J��");
		int A=scn.nextInt();
		System.out.println("�п�J�A�n��ܪ��r��");
		char B = scn.next().charAt(0);
		switch (n){
		case '�T' :
			for(int i=0;i<A;i++){
				for(int j=0;j<=i;j++){
					System.out.print(B);
				}
				System.out.println();
			}
			break;
		case '��':
			for(int i=0;i<A;i++){
				for(int j=0;j<A;j++){
					System.out.print(B);
				}
				System.out.println();
			}
			break;
		case '��':	
			for(int i=0;i<A;i++){
				for(int j=0;j<=A+2;j++){
					System.out.print(B);
				}
				System.out.println();
			}
			break;
			
			default:
				System.out.println("��p,�Ȥ��䴩���ϧ�");
				break;
		}
	}
		

}
