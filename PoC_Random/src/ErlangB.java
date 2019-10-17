import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class ErlangB {
	
	
	public static void main (String args[]){
		
//		System.out.println(ErlangBalgo(2.0, 2));
//		
//		System.out.println(erlang(2.0, 2));
//		System.out.print(erlangBApprox(2.0, 2));
		
		
		System.out.println((int)(0.357913 * 10000 )/ 10000.0);
	}
	
	public static double ErlangBalgo(Double erlangTraffic, Integer resources){
		Double InvB;
		
		InvB = 1.0;
		
		for(int j = 1; j <= resources; j++){
			InvB = 1 + InvB * j / erlangTraffic;
		}
		
		Double blockingProb = 1.0/InvB;
		return blockingProb;
	}
	
	
	public static int findMinServers(double load, double blockingProb) {
		// since the Erlang-B formula is convex for n > 1, we might use
		// the bisection (binary search) method. However it is more convenient
		// to apply the recursive formula

		if ((blockingProb == 1.0) || (load == 0.0)) {
			return 0;
		}

		double pn = 1.0;
		int n = 0;
		while (pn > blockingProb) {
			n++;
			pn = computeRecursive(n, load, pn);
		}
		return n;
	}
	
	protected static final double computeRecursive(double n, double load,
			double pn_1) {
		return (load * pn_1) / (n + load * pn_1);
	}
	
	
	public static double erlang(double traffic, int nbChannels) {
		double blockingProbability = 0.0;
		double sum = 0.0;

		for (int i = 0; i <= nbChannels; i++)
			try {
				sum += (blockingProbability = BigDecimal.valueOf(traffic).pow(i).divide(new BigDecimal(factorial(i)), 5, RoundingMode.HALF_UP).doubleValue());
			} catch (Exception e) {
				// Something went wrong, likely a "NaN" traffic, but we can just ignore it
			}

		return blockingProbability / sum;
	}
	
	
	
	public static BigInteger factorial(int i) {
		return (i == 0) ? BigInteger.ONE : BigInteger.valueOf(i).multiply(factorial(i - 1));
	}
	
	public static final double erlangBApprox(double n, double load) {
		int nInt = (int) Math.floor(n);
		if (nInt == n) {
			return erlangB(nInt, load);
		}

		double s = n - nInt;

		double numerator = (2.0 - s) * load + load * load;
		double denominator = s + 2 * load + load * load;
		double tmp = numerator / denominator; // eq. 5

		// eq. 4
		double pn = tmp;
		for (int i = 1; i <= nInt; i++) {
			pn = computeRecursive(i + s, load, pn);
		}
		return pn;
	}
	
	public static final double erlangB(int n, double load) {
		double pn = 1.0;
		for (int i = 1; i <= n; i++) {
			pn = computeRecursive(i, load, pn);
		}
		return pn;
	}
	
	
	
}
