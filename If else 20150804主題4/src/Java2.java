import java.util.Scanner;
public class Java2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�JA��");
		int A=scn.nextInt();
		System.out.println("�п�JB��");
		int B=scn.nextInt();
		System.out.println("�A�n�����B��O+,-,*��/�H");
		int C=A+B;
		int D=A-B;
		int E=A*B;
		float F=(float)A/(float)B;
		String str=scn.next();

		if (str.equals("+")) {
			System.out.println(A+"+"+B+"="+C);
		}else{
			if (str.equals("-")) {
				System.out.println(A+"��"+B+"="+D);
			}else {
				if (str.equals("*")) {
					System.out.println(A+"*"+B+"="+E);
				}else {
						System.out.println(A+"/"+B+"="+F);
				}
			}	
		}	
	}
}
						
				
			
