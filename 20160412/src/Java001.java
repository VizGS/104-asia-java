import java.util.Scanner;

class student {
	public static int length;
	int number;
	String name;
	String gender;
	double grade;

	student() {
		this.number = number;
		this.gender = gender;
		this.name = name;
		this.grade = grade;
	}

	void show() {
		System.out.print(number + "  " + name + "     " + gender + "     " + grade);
		System.out.println();
	}
}

public class Java001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�X��ǥ͸��");
		int n = scn.nextInt();
		student manystudents[] = new student[n];
		double a = 0,max = 0;
		System.out.println("�Ǹ��B�m�W�B�ʧO�B���Z");
		for (int i = 0; i < manystudents.length; i++) {
			manystudents[i] = new student();
			manystudents[i].number = scn.nextInt();
			manystudents[i].name = scn.next();
			manystudents[i].gender = scn.next();
			manystudents[i].grade = scn.nextDouble();
			for (int j = 0; j <= i; j++) {
				if (manystudents[j].grade >= manystudents[i].grade) {
					max = manystudents[j].grade;
				}
			}
			a += manystudents[i].grade;
		}
		System.out.println("�Ҧ��ǥ͸�Ʀp�U");
		for (student s : manystudents) {
			s.show();
		}
		System.out.println("�ǥͥ������Z:" + a / n);
		System.out.println("���Z�̰���:" +max);
	}

}
