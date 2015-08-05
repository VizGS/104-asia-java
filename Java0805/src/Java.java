import java.util.Scanner;
public class Java {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入店名");
		String A=scn.next();
		System.out.println("請輸入飲品");
		String B=scn.next();
		System.out.println("請輸入價格");
		int C=scn.nextInt();
		String D="綠茶";
		String E="咖啡";
		String F="50嵐";
		if(A!=F&&C<=45&&B==D||A!=F&&C<=45&&B==E){
		System.out.println("是建傑會買的飲料");
		}else{
			System.out.println("不是建傑會買的飲料");
		}
		
	}

}
