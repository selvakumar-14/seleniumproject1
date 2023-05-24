package javaclass;

import java.util.HashMap;

public class ExampleofHashmap {


	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(200, "phython");
		hm.put(241, "C++");
		hm.put(245, "Ruby");
		hm.put(288, "AngularJS");
		hm.put(300,"JavaScript");
		System.out.println("The Initial Map is:" + hm);
		System.out.println("The Value is:" + hm.get(288));
		hm.remove(300);
		System.out.println("The Changing Map is:" +hm);
		hm.replace(245,"Java");
		System.out.println("The new map is:" +hm);
		for(HashMap.Entry m:hm.entrySet()) {
		
			System.out.println(m.getKey()+"  "+m.getValue());
		
		}
				
	}
}

