import java.util.Random;

public class �ĤG�Q�C�D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		int data[] = new int[3];
		for (int i = 0; i < 3; i++) {
			data[i] = ran.nextInt(3000) + 1;
			System.out.println("�q���ҿ諸�~�����G" + data[i]);
			if (data[i] % 4 == 0 && data[i] % 100 != 0 | data[i] % 400 == 0 || data[i] == 0) {
				System.out.println("���~���|�~");
			} else {
				System.out.println("���~�����~");
			}
		}

	}

}
