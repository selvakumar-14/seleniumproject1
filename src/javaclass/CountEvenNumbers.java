package javaclass;

public class CountEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
		   //if number%2 == 0 it means its an even number
		    if (i % 2 == 0)
		    {
			   count++;
		    }
		System.out.println("The Count of Even Numbers are:" + count);
		}
		}
}