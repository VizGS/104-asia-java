import java.util.Scanner;
public class Java梯形 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入梯形的上底 and 下底 and 高");
float A=scn.nextFloat();
float B=scn.nextFloat();
float C=scn.nextFloat();
float V=(A+B)*C/2;
System.out.println("梯形面積為"+V);
	}

}
