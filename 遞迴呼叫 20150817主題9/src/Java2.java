import java.util.Random;
public class Java2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran=new Random();
		int a=ran.nextInt(1001)+1;
		System.out.println("�üƲ��ͪ����~���欰"+a+"��");
		fuck(a);
	}
	public static void fuck(int a){

		int b=0;
		int c=0;
		int d=0;
		int e=0;
			b=a/1000;
			c=(a%1000)/100;
			d=((a%1000)%100)/10;
			e=((a%1000)%100)%10;
		System.out.println(b+"�d"+"  "+c+"��"+"  "+d+"�B"+"  "+e+"��");
	}

	
}
