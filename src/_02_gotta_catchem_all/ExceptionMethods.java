package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double d,double two) throws IllegalArgumentException{
		if(two==0) {
			throw new IllegalArgumentException();
		}
		double quotient =d/two;
		return quotient;
		
	}
}
