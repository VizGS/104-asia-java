import java.util.Scanner;
public class Java3角 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入三角形的底");
float A=scn.nextFloat();
System.out.println("請輸入三角形的高");
float H=scn.nextFloat();
float V=A*H/2;
System.out.println("三角形面積為"+V);


System.out.println("請輸入三角形的底 and 高:");
float B=scn.nextFloat();
float X=scn.nextFloat();
float D=B*X/2;
System.out.print("三角形面積為"+D);




	}

}
