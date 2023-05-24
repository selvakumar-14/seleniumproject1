package javaclass;

public class Nestedifelse {

	public static void main(String[] args) {
		
		int a = 12, b = 10, c = 15;
		
		if(a >= b && a >= c)
		{
			System.out.println("a is the greatest number");
		}
		else if(b >= a && b >= c)
	    {
            System.out.println("b is the greatest number");

	    }
		else
		{
			 System.out.println("c is the greatest number");
		}
}
}