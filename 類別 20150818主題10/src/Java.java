import java.util.Scanner;
public class Java {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invo invo1=new Invo(3);
		Scanner scn=new Scanner(System.in);
		System.out.println("*********歡迎使用亞大發票機*********");
		System.out.println();
		System.out.println("請輸入各品項購買的數量");
		System.out.println("1.惡鬼槌");
		System.out.println("2.雷神斧");
		System.out.println("3.破魔劍");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
			invo1.addItem("惡鬼槌",a,(float) 100.85);
			invo1.addItem("雷神斧",b,(float) 108.85);
			invo1.addItem("破魔劍",c,(float) 98.25);

		invo1.show();
	}

}
