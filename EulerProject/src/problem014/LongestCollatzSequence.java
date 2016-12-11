package problem014;

import java.util.Scanner;

public class LongestCollatzSequence {
	public static void main(String[] args) {
		long tempNumber = 0;
		long findNumber = 0;
		int findCount = 0;
		int count; 
		
		for (long number = 1000000; number > 0; number--) {
			count = 1;
			tempNumber = number;
			while (!isFirst(tempNumber)) {
				// odd
				if (tempNumber % 2 == 1) {
					tempNumber = 3 * tempNumber + 1;
				} else {
					tempNumber = tempNumber / 2;
				}
				count++;
			}
			
			if(findCount < count) {
				findNumber = number;
				findCount = count;
			}
		}
		
		System.out.println("Find number  : " + findNumber);
		System.out.println(findCount + " items");
	}

	public static boolean isFirst(long number) {
		if (number == 1) {
			return true;
		}
		return false;
	}
}
