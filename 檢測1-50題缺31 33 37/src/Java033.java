import java.util.Scanner;

public class Java033 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		int A = X / 100;
		int B = X % 100;
		if (A == 1 && B > 20 && B < 32 || A == 2 && B < 20) {
			System.out.println("Aquarius");
		} else if (A == 2 && B > 19 && B < 32 || A == 3 && B < 21)
			System.out.println("Pisces");
		else if (A == 3 && B > 20 && B < 32 || A == 4 && B < 20)
			System.out.println("Aries");
		else if (A == 4 && B > 19 && B < 32 || A == 5 && B < 21)
			System.out.println("Taurus");
		else if (A == 5 && B > 20 && B < 32 || A == 6 && B < 22)
			System.out.println("Gemini");
		else if (A == 6 && B > 21 && B < 32 || A == 7 && B < 23)
			System.out.println("Cancer");
		else if (A == 7 && B > 22 && B < 32 || A == 8 && B < 23)
			System.out.println("Leo");
		else if (A == 8 && B > 22 && B < 32 || A == 9 && B < 23)
			System.out.println("Virgo");
		else if (A == 9 && B > 22 && B < 32 || A == 10 && B < 24)
			System.out.println("Libra");
		else if (A == 10 && B > 23 && B < 32 || A == 11 && B < 22)
			System.out.println("Scorpio");
		else if (A == 11 && B > 21 && B < 32 || A == 12 && B < 21)
			System.out.println("Sagittarius");
		else if (A == 12 && B > 20 && B < 32 || A == 1 && B < 21)
			System.out.println("Capricorn");
	}

}
