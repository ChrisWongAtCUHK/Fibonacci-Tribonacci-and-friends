import java.util.Arrays;

public class Xbonacci {

	public double[] xbonacci(double[] signature, int n) {
		double[] result = Arrays.copyOf(signature, n);
		for (int i = signature.length; i < n; i++) {
			result[i] = 0;
			for(int j = 1; j <= signature.length; j++){
				result[i] += result[i - j];
			}
		}
		return result;
	}
}