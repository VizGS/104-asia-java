

public class Java005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=1;
		int n2=1;
		System.out.print(n1+","+n2);
		System.out.print(","+back(n1,n2));
	}
	public static int back(int n1,int n2){
		int n3=n1+n2;
		if(n3<55){
			System.out.print(","+n3);
			return back(n1=n2,n2=n3);
		}else{
			return n3;
		}
	}

}
