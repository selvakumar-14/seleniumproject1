package javaclass;

public class Countthedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int digits = 78945;
         int count = 0;
        while(digits != 0) {
        	digits = digits/10;
        	count++;
        }
        	System.out.println(count);	 
        
	}

}
