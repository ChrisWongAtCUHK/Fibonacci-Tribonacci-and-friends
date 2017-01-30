import java.util.Arrays;

public class Xbonacci {

	public double[] xbonacci(double[] signature, int n) {
		double[] x = Arrays.copyOf(signature, n);
		for (int i = signature.length; i < n; i++) {
			x[i] = Arrays.stream(x).skip(i - signature.length).sum();
		}
		return x;
	}
}