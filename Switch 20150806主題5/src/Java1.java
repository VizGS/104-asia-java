import java.util.Scanner;
public class Java1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入星期1~7");
		int A=scn.nextInt();
		switch(A){
		case 1:
			System.out.println("星期"+A+"的英文是Monday");
			break;
		case 2:
			System.out.println("星期"+A+"的英文是Tuesday");
			break;
		case 3:
			System.out.println("星期"+A+"的英文是Wednesday");
			break;
		case 4:
			System.out.println("星期"+A+"的英文是Thursday");
			break;
		case 5:
			System.out.println("星期"+A+"的英文是Friday");
			break;
		case 6:
			System.out.println("星期"+A+"的英文是Saturday");
			break;
		case 7:
			System.out.println("星期"+A+"的英文是Sunday");
			break;
		default:
			System.out.println("使用者輸入錯誤");
			break;
		}
		
	}

}
