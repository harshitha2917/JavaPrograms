package collection;

import java.util.HashSet;
import java.util.Set;

public class Set_Property {
public static void main(String[] args) {
	Set<Integer> s=new HashSet<Integer>();
	s.add(34);
	s.add(24);//it does not follow indexing
	s.add(645);
	s.add(76);
	s.add(43);
	s.add(43);//it does not accept duplicate values
	System.out.println(s);
	
}
}
