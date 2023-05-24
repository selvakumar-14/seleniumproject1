package javaclass;

import java.util.ArrayList;
import java.util.List;

public class Collectionexample {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("Mango");
	    list.add("Banana");
	    list.add("Apple");
	    list.add("Kiwi");
	    System.out.println("Reurning element:" + list.get(3));
	    list.set(1,"Watermeleon");
	    for(String fruit:list) {
	   System.out.println(fruit); 	
	}

}}
