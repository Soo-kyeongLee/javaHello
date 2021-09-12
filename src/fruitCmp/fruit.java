package fruitCmp;

import java.util.Comparator;

public class fruit {
	int no;
	String name;
	int price;
	public fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

}

class fruitCmp implements Comparator<fruit>{

	@Override
	public int compare(fruit o1, fruit o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

class fruitCmpDesc implements Comparator<fruit>{

	@Override
	public int compare(fruit o1, fruit o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
	
}
