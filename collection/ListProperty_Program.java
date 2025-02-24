package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListProperty_Program {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(56);
		li.add(12);
		li.add(33);
		li.add(555);
		li.add(987);
		Collections.sort(li);
		System.out.println(li);

		// Iterator-Repeating something again and again
		// iterator is an abstract method
		// the return type of iterator is Iterator
		// Iterator inteface by default on left side

		Iterator i1 = li.iterator();// Abstract method of List on right side
		// hasnext-RT-boolean-next element is present or not present?
		// next-RT-Object
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

	}
}
