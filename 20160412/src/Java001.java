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
		System.out.println("幾位學生資料");
		int n = scn.nextInt();
		student manystudents[] = new student[n];
		double a = 0,max = 0;
		System.out.println("學號、姓名、性別、成績");
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
		System.out.println("所有學生資料如下");
		for (student s : manystudents) {
			s.show();
		}
		System.out.println("學生平均成績:" + a / n);
		System.out.println("全班最高分:" +max);
	}

}
