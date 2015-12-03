
class IcCard {
	long id;
	int money;

	void showInfo() {
		System.out.println("卡片卡號" + id);
		System.out.println("，餘額" + money + "元");
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

		System.out.println("扣除7000元"+(myCard.add(7000)?"成功":"失敗"));
		myCard.showInfo();
		System.out.println("扣除2000元"+(myCard.add(2000)?"成功":"失敗"));
		myCard.showInfo();
	}

}
