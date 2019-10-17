import org.apache.commons.math3.util.Precision;

public class PrecisionEqualityTest {
	
	public static void main (String[] args){
		double a = 2.0;
		double b = -1.0;
		
		System.out.println(Precision.equals(a, b, 0.2));
		System.out.println(Precision.equals(a, b, 0.001));
	}
}
