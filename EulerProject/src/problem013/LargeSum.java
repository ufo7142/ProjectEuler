package problem013;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fis = new FileInputStream("C:/Users/LEE/Desktop/numberText.txt");
		Scanner scan = new Scanner(fis);
		
		BigInteger sum = new BigInteger("0");
		
		while(scan.hasNext()) {
			sum = sum.add(new BigInteger(scan.nextLine()));
		}
		
		System.out.println(sum.toString().substring(0, 10));
	}
}
