package calculation;

public class double2 {
    double sum(double a, double b, double c)
    {
    	double sum = a + b + c;
    	return sum;
    }
	public static void main(String[] args) {
      
		double2 d2 = new double2();
		
		double data = d2.sum(4.567, 2.897, 3.786);
		
		System.out.println(data);

	}

}
