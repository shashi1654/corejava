package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArreyListExample {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("shashi");
		list1.add("sanker");
		list1.add("raj");
		list1.add("sanyu");
		list1.add("chudloo");
		System.out.println("list is this" + list1);
		System.out.println("size of array list " + list1.size());
		
		list1.remove(1);
		System.out.println("list is after removing" + list1);
		System.out.println("size of array list " + list1.size());
	
		
		System.out.println("the date of second position is " + list1.get(3));
		list1.set(0, "chhote");
		System.out.println("list is after replaceing " + list1);
		list1.add(1, "shanker");
		System.out.println("after adding name " + list1);
		Collections.sort(list1);
		System.out.println("list is after sort " + list1);
	
		for (String name : list1) {
			System.out.println(name);
			
		}
		
	
		

	}

}
