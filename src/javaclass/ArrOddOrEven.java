package javaclass;

public class ArrOddOrEven {

	public static void main(String[] args) {
		
		int a[]= {8,6,5,4,3,8,9};
		
		for( int i=0; i<a.length; i++) {
			
			if((a[i]%2) == 0) {
				
				System.out.println("The Even Numbers are:" +a[i]);
			
			}
			else
			{
				System.out.println("The Odd Numbers are:" +a[i]);
			}
		}

	}

}
