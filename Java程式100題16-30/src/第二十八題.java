import java.util.Random;

public class �ĤG�Q�K�D {

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
		int f=0;
		int g=0;
		int p=0;
		if(a>0){
			b=a/500;
			p=a%500;
			if(p!=0){
				c=p/100;
				p=p%100;
				if(p!=0){
					d=p/50;
					p=p%50;
					if(p!=0){
						e=p/10;
						p=p%10;
						if(p!=0){
							f=p/5;
							p=p%5;
							if(p!=0){
								g=p/1;
					}
				}
			}
		}
		System.out.println(b+"�i����"+"\t"+c+"�i�@��"+"\t"+d+"��50"+"\t"+e+"��10"+"\t"+f+"��5"+"\t"+g+"��1");
	}

		}
	}

}
