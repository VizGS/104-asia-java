import java.util.Random;
import java.util.Scanner;
public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		Random a=new Random();
		int c=0;
		int data[]=new int[10];
		for(int i=0;i<10;i++){
			int f=a.nextInt(100)+1;
			data[i]=f;
			 for(int p=0;p<i;p++){
					if(data[p]==data[i]){
						i--;
						break;
					}
				}
		if( f%2==0){
			c++;
		}
		}
		System.out.println("�вq���X�Ӱ���?");
		int b=scn.nextInt();
		int d=0;			
	while(d!=2){
			
		if(b!=c){
			System.out.println("����,���~��q");
			b=scn.nextInt();
			d++;			
			}
		if(b==c){
			d=2;
				}
	}
		if(b==c){
			System.out.println("���ߧA����F!");
			}
		else{
			System.out.println("�w�q��3��,�A��F!");
			System.out.println("�@��"+c+"�Ӱ���");
		}
		System.out.print("�Ʀr�Ѥp��j�O   ");
		for(int k=0;k<10;k++){
			for(int m=k;m<10;m++){
				if(data[k]>data[m]){
					int n=data[k];
					data[k]=data[m];
					data[m]=n;
				}
				
			}
		System.out.print(data[k]+"  ");
		}
	}

		

}

