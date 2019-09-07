package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double d,double two) throws IllegalArgumentException{
		if(two==0) {
			throw new IllegalArgumentException();
		}
		double quotient =d/two;
		return quotient;
		
	}
	String reverseString(String s) throws IllegalStateException{
		String backwards="";
		for(int i =s.length()-1;i>=0;i--) {
			backwards+=s.charAt(i);
		}
		return backwards;
	}
}
