package fruitCmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<fruit> list=new ArrayList<fruit>();
		
		String arr[]=new String[] {"Apples","Straberries","Bananas","Peaches","Mangoes","Kiwifruit","Watermelons","Passionfruit","Oranges","Limes"};
		System.out.println("Fruit List (ordered by name)");
		
		Random r=new Random();
		for(int i=0;i<10;i++) {
			fruit s=new fruit(i,arr[i],r.nextInt(20000)+2000);
			list.add(s);
		}
		
		Collections.sort(list,new fruitCmp());
		for(fruit s:list) {
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (descending)");
		Collections.sort(list,new fruitCmpDesc());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
