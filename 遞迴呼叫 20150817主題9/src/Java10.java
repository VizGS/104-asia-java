import java.util.Scanner;
public class Java10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scn=new Scanner(System.in);
		System.out.println("�п�Jn����");
		int a=scn.nextInt();
		System.out.println("�o"+fuck(a));
	}

	public static int fuck(int a){
		if(a==1){
			return (int) Math.pow(2, a); 
		}else{
			return (int) Math.pow(2, a)+fuck(a-1);
		}
	}
}
