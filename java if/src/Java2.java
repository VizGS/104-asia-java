import java.util.Scanner;
public class Java2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入A值");
		int A=scn.nextInt();
		System.out.println("請輸入B值");
		int B=scn.nextInt();
		System.out.println("你要做的運算是+,-,*或/？");
		int C=A+B;
		int D=A-B;
		int E=A*B;
		float F=(float)A/(float)B;
		String str=scn.next();

		if (str.equals("+")) {
			System.out.println(A+"+"+B+"="+C);
		}else{
			if (str.equals("-")) {
				System.out.println(A+"－"+B+"="+D);
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
						
				
			
