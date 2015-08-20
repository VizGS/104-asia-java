
public class Java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n=5000000*0.78;
		int m=0;
		double b=20000;
		while(b+n<=5000000){			
		    b=b*1.15;
			m++;
		}
		System.out.println(m+"個小時後");
	}

}
