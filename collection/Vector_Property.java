package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Property {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.addElement(29);
		v1.addElement(54);
		v1.addElement(56);
		v1.addElement(534);
		v1.firstElement();
		System.out.println(v1);

		System.out.println("Iteraton using Enumeration");
		Enumeration e1 = v1.elements();
		while (e1.hasMoreElements()) //the return type of hasMoreElements is boolean
		{
			System.out.println(e1.nextElement());
		}
	}
}
