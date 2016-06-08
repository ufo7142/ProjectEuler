package problem004;

public class LargestPalindrome {

	public static void main(String[] args) {
		
		int max = 0;
		
		for(int i = 999; i >= 100; i--) {
			for(int j = 999; j >= 100; j--) {
				if(isPalindrome(i*j) && max < (i*j)) {
					max = i*j;
				}
			}
		}
		
		System.out.println("result : "+ max);
	}
	
	public static boolean isPalindrome(int number) {
		int compareNumber = 0;
		int copyNumber = number;
		
		while(copyNumber > 0) {
			compareNumber = compareNumber * 10 + copyNumber % 10;
			copyNumber = copyNumber / 10;
		}
		
		return compareNumber == number;
	}
}
