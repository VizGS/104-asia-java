public class Invo{
	private String name="發票(亞洲資工站)";
	private int num=0,p=0;
	private Item item[];
	
	public Invo(int num1){
		num=num1;
		item=new Item[num];
	}
	
	public void addItem(String itemName,int a,float price){
		item[p]=new Item(itemName, a, price);
		p++;
	}
	
	public void show(){

		System.out.println("\t"+"               "+name+"\t");
		System.out.println();
		System.out.println("台中市霧峰區柳豐路500號");
		System.out.println("電話:04-23323456 #6101");
		System.out.println("傳真:04-23233876");
		System.out.println("========================================");
		System.out.println("品項名稱"+"\t"+"\t"+"數量"+"\t"+"單價"+"\t"+"小計");
		System.out.println("----------------------------------------");

		for(int i=0;i<num;i++){
			System.out.println(item[i].getItemName()+"\t"+"\t"+item[i].A()+"\t"+item[i].getPrice()+"\t"+item[i].getSum());
		}
		System.out.println("========================================");
		float c=0;
		for(int j=0;j<num;j++){
		c+=item[j].getSum();
		}
		System.out.println("合計:"+c);
	}
}