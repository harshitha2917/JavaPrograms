package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Program {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(56);
		li.add(12);
		li.add(33);
		li.add(555);
		li.add(987);
		System.out.println(li);

		// here the return type of iterator is Iterator of Object
		System.out.println("Iterator->forward Iteration");
		
		Iterator<Integer> i3 = li.iterator();
		while (i3.hasNext())
		{
			System.out.println(i3.next());
		}

		System.out.println("ListIterator->forward Iteration");
		
		ListIterator<Integer> i4 = li.listIterator();
		while (i4.hasNext())
		{
			System.out.println(i4.next());
		}
	
		System.out.println("ListIterator->backward Iteration");

		while (i4.hasPrevious()) 
		{
			System.out.println(i4.previous());
		}

	}
}