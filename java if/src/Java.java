import java.util.Scanner;
public class Java {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入A值");
int A=scn.nextInt();
System.out.println("請輸入B值");
int B=scn.nextInt();
		
if (A > B) {
			System.out.println(A+">"+B);
		} else {
			System.out.println(B+">"+A);
		}

}

}
