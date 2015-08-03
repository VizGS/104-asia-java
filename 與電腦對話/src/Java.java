import java.util.Scanner;

public class Java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
System.out.print("Hello,請問你叫什麼名字");
String name=scn.next();
System.out.println("Hi,"+name+"你好,歡迎來到亞大");
System.out.print("請輸入攝氏溫度");
float c=scn.nextFloat();
float f=c*9/5+32;
System.out.println("華氏溫度為"+f);
	}
}
