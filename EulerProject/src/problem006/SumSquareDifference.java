package problem006;

public class SumSquareDifference {

	public static void main(String[] args) {
		int sumOfSquare = 0;
		int squareOfSum = 0;
		int result = 0;
		
		for(int i = 1; i <= 100; i++) {
			sumOfSquare += i*i;
			squareOfSum += i;
		}
		
		result = (squareOfSum*squareOfSum) - sumOfSquare;
		
		System.out.println(result);
		
	}
}
