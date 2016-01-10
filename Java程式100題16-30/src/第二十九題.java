
import java.util.Scanner;

public class 第二十九題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
        int b = 0;
    	int c = 0;
		int d = 0;
		int e = 0;
        if(a / 1000!=0){
            b = a / 1000;
            System.out.print(b + "仟");
        }
        if((a % 1000) / 100!=0){
            c = (a % 1000) / 100;
            System.out.print(c + "佰");
        }
        if(((a % 1000) % 100) / 10!=0){
            d = ((a % 1000) % 100) / 10;
            System.out.print(d + "拾");
        }
		e = ((a % 1000) % 100) % 10;
		System.out.print(e + "元");
	}

}
