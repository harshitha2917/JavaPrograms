package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
public static void main(String[] args) {
	Collection c1=new ArrayList();
	c1.add(123);//Storing heterogeneous values of any length
	c1.add("Ram");
	c1.add(10000);
	c1.add('M');
	c1.add(false);
	c1.add(null);
	System.out.println(c1);
	
}
}
