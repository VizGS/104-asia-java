import java.util.Scanner;
public class Java002{
    public static void main(String args[]){
       Scanner scn = new Scanner(System.in);
    	int a = scn.nextInt();
		int data[][] = new int[a][a];
		int count = 1;
		int j = 0;
		int k = 0;
		for (int i = 0; i < 2 * a - 1; i++) {
			if (i < a) {
				j = i;
				k = 0;
				while (j >= 0 && k < a) {
					data[j][k] = count;
					count++;
					j--;
					k++;
				}
			} else {
				j = a - 1;
				k = i - a + 1;
				while (j >= 0 && k < a) {
					data[j][k] = count;
					count++;
					j--;
					k++;
				}
			}
		}
 
		for (int x = 0; x < a; x++) {
			for (int y = 0; y < a; y++) {
				System.out.print(data[x][y] + "\t");
			}
			System.out.println();
		}
    }
}