package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//Collection can't be sort so we use ArrayList here
public class Collection_Sort {
public static void main(String[] args) {
	ArrayList<Integer> c1=new ArrayList<Integer>();
	c1.add(45);
	c1.add(55);
	c1.add(35);
	c1.add(15);
	c1.add(05);
	Collections.sort(c1);
	System.out.println(c1);
	

}
}
