
class IcCard {
	long id;
	int money;

	void showInfo() {
		System.out.println("�d���d��" + id);
		System.out.println("�A�l�B" + money + "��");
	}

	Boolean add(int value) {
		if(value>0&&money-value>=0){
			money-=value;
			return true;
		}
		return false;
	}
}

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IcCard myCard = new IcCard();
		myCard.id = 0x336789AB;
		myCard.money = 8888;

		System.out.println("����7000��"+(myCard.add(7000)?"���\":"����"));
		myCard.showInfo();
		System.out.println("����2000��"+(myCard.add(2000)?"���\":"����"));
		myCard.showInfo();
	}

}
