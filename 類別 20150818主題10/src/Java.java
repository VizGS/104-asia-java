import java.util.Scanner;
public class Java {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invo invo1=new Invo(3);
		Scanner scn=new Scanner(System.in);
		System.out.println("*********�w��ϥΨȤj�o����*********");
		System.out.println();
		System.out.println("�п�J�U�~���ʶR���ƶq");
		System.out.println("1.�c���l");
		System.out.println("2.�p����");
		System.out.println("3.�}�]�C");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
			invo1.addItem("�c���l",a,(float) 100.85);
			invo1.addItem("�p����",b,(float) 108.85);
			invo1.addItem("�}�]�C",c,(float) 98.25);

		invo1.show();
	}

}
