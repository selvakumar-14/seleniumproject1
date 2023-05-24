package javaclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_alaphabetical {

	public static void main(String[] args) {
	 

	Set<String> set1 = new LinkedHashSet<String>();
	set1.add("Java");
	set1.add("Python");
	set1.add("C++");
	set1.add("Zebra");
	set1.add("C");
	set1.add("Ruby");
	set1.add("Angular");
	set1.add("Aario");
	set1.add("Bairav");
	List<String> alpha = new ArrayList<String>(set1);
	Collections.sort(alpha);
	System.out.println(alpha);
	}

}
