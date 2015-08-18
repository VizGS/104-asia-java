import java.util.Scanner;
public class Java6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("½Ğ¿é¤Jx,yªº­È");
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(b>a){
			int c=a;
			a=b;
			b=c;
		}
		fuck(a,b);
	}

	public static int fuck(int a,int b){
		
		int e=a;
		int f=b;
		if(e%f==0){
			return a;
			if(a%e==0){
				int g=a%f;
				int h=b%f;
				return g*h;
			}
		}else{
			int c=e%f;
			return fuck(e=f,f=c);
		}
	}
}
