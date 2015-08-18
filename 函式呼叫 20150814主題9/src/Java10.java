import java.util.Scanner;
public class Java10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("½Ð¿é¤J¦r¦ê");
		String a=scn.next();
		fuck(a);
	}

	public static void fuck(String a){

		int c=0;
		char d[]=a.toCharArray();
		for(int i=0;i<a.length();i++){			
			int b= a.charAt(i);
			if(b>=48&&b<=57){
				c+=d[i]-'0';
			}
		}
		System.out.println(c);
	}
	
}

