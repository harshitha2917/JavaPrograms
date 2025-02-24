package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Program1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(56);
		li.add(12);
		li.add(33);
		li.add(555);
		li.add(987);
		System.out.println(li);
		
		//here the return type of iterator is Iterator of Object		
		Iterator<Integer> i3 = li.iterator();
		while (i3.hasNext())
		{
			System.out.println(i3.next());
		}

	}
}
