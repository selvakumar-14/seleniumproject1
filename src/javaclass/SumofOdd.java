package javaclass;

public class SumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int N, i, sum = 0;
		    N = 100;

		    for(i = 0; i <= N; i++){
		        if((i%2) == 1){
		            sum += i;
		        }
		    }
		 
		    System.out.print("Sum of all odd numbers between 0 to " + N + " = " + sum);
		}
	}


