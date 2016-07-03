package problem012;

public class TriangularNumber {

	public static void main(String[] args) {

		int number = 1;
		int triangularNumber = 0;
		int maximum = 500;
		int count = 0;
		
		while(count < maximum) {
			triangularNumber = (number * (number + 1)) / 2;
			count = function(triangularNumber);
			number++;
		}
		
		System.out.println(triangularNumber);
	}
	
	public static int function(int number) {
		int count = 0;
		
		for(int i = 1; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				count += 2;
			}
		}
		return count;
	}
}
