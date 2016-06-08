package problem005;

public class SmallestMultiple {

	public static void main(String[] args) {
		int i = 2;
		long result = 1;
		
		while(i < 21) {
			result = lcm(result, i);
			i++;
		}
		
		System.out.println(result);
	}
	
	public static long lcm(long a, long b) {
		int gcdValue = gcd((int)a, (int)b);
		return (( a * b ) / gcdValue);
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
