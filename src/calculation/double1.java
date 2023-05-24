package calculation;

public class double1 {
    
	double sum(double a, double b)
	{ 
		double sum = a + b;
		return sum;
	}
	public static void main(String[] args) {
         
		double1 d1 = new double1();
		
		double data = d1.sum(8.712345, 7.6674);
        
		System.out.println(data);
	}


}
