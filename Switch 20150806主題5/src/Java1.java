import java.util.Scanner;
public class Java1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�P��1~7");
		int A=scn.nextInt();
		switch(A){
		case 1:
			System.out.println("�P��"+A+"���^��OMonday");
			break;
		case 2:
			System.out.println("�P��"+A+"���^��OTuesday");
			break;
		case 3:
			System.out.println("�P��"+A+"���^��OWednesday");
			break;
		case 4:
			System.out.println("�P��"+A+"���^��OThursday");
			break;
		case 5:
			System.out.println("�P��"+A+"���^��OFriday");
			break;
		case 6:
			System.out.println("�P��"+A+"���^��OSaturday");
			break;
		case 7:
			System.out.println("�P��"+A+"���^��OSunday");
			break;
		default:
			System.out.println("�ϥΪ̿�J���~");
			break;
		}
		
	}

}
