import java.util.Scanner;
public class Java4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�Jx,y����");
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(b>a){
			int c=a;
			a=b;
			b=c;
		}
		System.out.println("��Ƥ��̤j���]�Ƭ�"+fuck(a,b));
	}

	public static int fuck(int a,int b){
		if(a%b==0){
			return b;
		}else{
			int c=a%b;
			return fuck( a=b, b=c);
		}	
		
	}
}
