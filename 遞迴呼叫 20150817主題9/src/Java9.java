import java.util.Scanner;
public class Java9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入n的值");
		int a=scn.nextInt();
		System.out.println("得"+fuck(a));
	}

	public static double fuck(int a){
		if(a==1){
			return (float) (1.0/((2*a-1)*(2*a))); 
		}else{
			return (float) (1.0/((2*a-1)*(2*a)))+fuck(a-1);
		}
	}
}
