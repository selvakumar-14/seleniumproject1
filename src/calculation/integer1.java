package calculation;

public class integer1 {
     
	int sumoftwointeger(int a, int b) {
	   
        int sum = a + b ;
        return sum;
	}
	int sumofthreeinteger(int a, int b, int c) {
		
		int sum = a + b + c;
		return sum;
	}
	double sumoftwodouble(double a, double b) {
		
		double sum = a + b;
		return sum;
	}
	double sumofthreedouble(double a, double b, double c) {
		
		double sum = a + b +c;
		return sum;
	}
	public static void main(String[] args) {
		
		
		integer1 int1 = new integer1();
		
	    integer2 int2 = new integer2();
    
	    double1 d1 = new double1();
	    
	    double2 d2 = new double2();
		
	    System.out.println("sum of two integer" + int1.sumoftwointeger(3, 70));
		
        System.out.println("sum of three integer" + int2.sum(4, 5, 6));
        
        System.out.println("sum of two double" + d1.sum(7.654,8.654));
        
        System.out.println("sum of three double" + d2.sum(5.987, 4.532, 3.564));
        
	}

}
