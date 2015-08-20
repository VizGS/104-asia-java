public class Item{
	private String itemName="";
	private int a=0;
	private float price=0.0f;
	
	public Item(String name,int b,float p1){
		itemName=name;
		a=b;
		price=p1;
	}
	
	public float getSum(){
		return a*price;
	}
	public String getItemName(){
		return itemName;
	}
	public float getPrice(){
		return price;
	}
	public int A(){
		return a;
	}
}

