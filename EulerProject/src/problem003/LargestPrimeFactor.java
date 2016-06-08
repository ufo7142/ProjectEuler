package problem003;

public class LargestPrimeFactor {

	public static void main(String[] args) {

		int i = 2;
		long num = 600851475143L;
		
		while(i < num) {
			if(num % i == 0) {
				num /= i;
			}
			i++;
		}
		System.out.println(num);
	}
}
