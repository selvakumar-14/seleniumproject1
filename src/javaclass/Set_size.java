package javaclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_size {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		if(set1.size()>5)
		{
			set1.removeAll(set1);
			System.out.println(set1);
		}

		else
		{
		List<Integer> list = new ArrayList<Integer>(set1);
		Collections.reverse(list);	
		System.out.println(list);
		}
	}

}
