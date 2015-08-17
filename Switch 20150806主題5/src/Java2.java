import java.util.Scanner;
public class Java2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入身分證字號的英文(大寫)");
		char ab=scn.next().charAt(0);
		switch(ab){
		case 'A':
			System.out.println("台北市");
			break;
		case 'B':
			System.out.println("台中市");
			break;
		case 'C':
			System.out.println("基隆市");
			break;
		case 'D':
			System.out.println("台南市");
			break;
		case 'E':
			System.out.println("高雄市");
			break;
		case 'F':
			System.out.println("台北縣");
			break;
		case 'G':
			System.out.println("宜蘭縣");
			break;
		case 'H':
			System.out.println("桃園縣");
			break;
		case 'I':
			System.out.println("嘉義市");
			break;
		case 'J':
			System.out.println("新竹縣");
			break;
		case 'K':
			System.out.println("苗栗縣");
			break;
		case 'L':
			System.out.println("台中縣");
			break;
		case 'M':
			System.out.println("南投縣");
			break;
		case 'N':
			System.out.println("彰化縣");
			break;
		case 'O':
			System.out.println("新竹市");
			break;
		case 'P':
			System.out.println("雲林縣");
			break;
		case 'Q':
			System.out.println("嘉義縣");
			break;
		case 'R':
			System.out.println("台南縣");
			break;
		case 'S':
			System.out.println("高雄縣");
			break;
		case 'T':
			System.out.println("屏東縣");
			break;
		case 'U':
			System.out.println("花蓮縣");
			break;
		case 'V':
			System.out.println("台東縣");
			break;
		case 'W':
			System.out.println("金門縣");
			break;
		case 'X':
			System.out.println("澎湖縣");
			break;
		case 'Y':
			System.out.println("陽明山");
			break;
		case 'Z':
			System.out.println("馬祖");
			break;
		default:
			System.out.println("使用者輸入錯誤");
			break;
		 }
	}

}
