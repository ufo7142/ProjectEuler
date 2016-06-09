package problem007;

public class Prime10001st {

	public static void main(String[] args) {
		int number = 2;
		int count = 1;
		int limit = 10001;
		
		while(count <= limit) {
			if(isPrime(number)) {
				count++;
			}
			number++;
		}
		
		System.out.println(--number);
	}
	
	public static boolean isPrime(int number) {
		if(number == 2) {
			return true;
		}
		else if(number % 2 == 0) {
			return false;
		}
		
		int i = 3;
		
		int range = (int)(Math.sqrt(number)) + 1;
		
		while(i < range) {
			if(number % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
