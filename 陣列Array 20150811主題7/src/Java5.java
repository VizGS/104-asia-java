import java.util.Random;
public class Java5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random a=new Random();
		int c=0;
		int d=0;
		int e=0;
		int data[]=new int[20];
		for(int i=0;i<20;i++){
			int b=a.nextInt(20)-10;
			data[i]=b;
			if(b<0){
				c++;
			}else{
				if(b==0){
					d++;
				}else{
					e++;
				}
			}
		}
	
		for(int j=0;j<20;j++){
			System.out.print(data[j]+"  ");
		}
		System.out.println(" ");
		System.out.println("正值有"+e+"個");
		System.out.println("負值有"+c+"個");
		System.out.println("0有"+d+"個");
	}

}
