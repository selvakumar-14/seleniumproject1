package javaclass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union_set {

	public static void main(String[] args) {
      
		String A[] = {"Java","Python","C++","C","Ruby","Angular"};
		String B[] = {"ReactJs","Java","Javascript","Powershell","Ruby","Python","Devops"};
		Set<String> set1= new HashSet<String>();
	    set1.addAll(Arrays.asList(A));
		Set<String> set2 = new HashSet<String>();
		set2.addAll(Arrays.asList(B));
		Set<String> Union_data = new HashSet<String>(set1);
		Union_data.addAll(set2);
		System.out.print("Union of set1 and set2 is:" +Union_data);    
      //  System.out.println(Union_data);    

	}

}
