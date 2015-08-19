import java.util.Scanner;
public class Java7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("½Ð¿é¤Jx,y,zªº­È");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int d=scn.nextInt();
		if(b>a){
			int c=a;
			a=b;
			b=c;
		}
		System.out.println((a/fuck(d,fuck(a,b)))*(b/fuck(d,fuck(a,b)))*(d/fuck(d,fuck(a,b)))*fuck(d,fuck(a,b)));
	}

	public static int fuck(int a,int b){
		
		if(a%b==0){
			return b;
		}else{
			int c=a%b;
			return fuck(a=b,b=c);
		}
	}
}
