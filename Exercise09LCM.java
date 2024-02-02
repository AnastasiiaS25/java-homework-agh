package pl.edu.agh.asd1;

public final class Exercise09LCM {

	public static int leastCommonMultiple(int n, int m) {
		n = Math.abs(n);
		m = Math.abs(m);
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		int leastCommonMultiple = max;
		while (leastCommonMultiple % min != 0) {
			leastCommonMultiple += max;
		}
		return leastCommonMultiple;
	}
}





