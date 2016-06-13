package problem009;
/*
 * https://en.wikipedia.org/wiki/Pythagorean_triple
 * Euclid's formula[1] is a fundamental formula for generating Pythagorean triples
 * given an arbitrary pair of positive integers m and n with m > n. 
 * The formula states that the integers
 * a = m^2-n^2, b = 2mn, c = m^2+n^2 
 */

public class Pythagorean {
	public static void main(String[] args) {
		int a, b, c = 0;
		
		for(int n = 1; n < 500; n++) {
			for(int m = n+1; m < 500; m++) {
				a = (m*m) - (n*n);
				b = 2*m*n;
				c = (m*m) + (n*n);
				
				if((a+b+c) == 1000) {
					System.out.println("A : " + a + " B : " + b + " C : "+ c);
					System.out.println("ABC : " + a*b*c);
				}
			}
		}
		
	}
}
