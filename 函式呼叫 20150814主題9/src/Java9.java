import java.util.Scanner;
public class Java9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入三角形的三邊長");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		System.out.println(fuck(a,b,c));
		int e=0;
		int f=0;
		int g=0;
		java(e,f,g);
	}
	
	public static String fuck(int a,int b, int c){
		
		String d="是合法三角形";
		String e="不是合法三角形";
		if(a>b){
			int f=a;
			a=b;
			b=f;
		}
		if(b>c){
			int f=b;
			b=c;
			c=f;
		}
		if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)&&(a+b)>c&&(a+c)>b&&(b+c)>a){
			return d;
		}else{
			return e;
		}

	}
	public static void java(int a,int b,int c){
		for(a=1;a<200;a++){
			for(b=1;b<200;b++){
				for(c=1;c<200;c++){
					if((a+b+c)<200&&Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)){
						System.out.println(a+"\t"+b+"\t"+c);
					}
				}
			}
		}
	}
}
