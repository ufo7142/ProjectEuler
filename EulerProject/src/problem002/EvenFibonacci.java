package problem002;

public class EvenFibonacci {

	public static void main(String[] args) {

		int sum = 0;
		int fibo1 = 1, fibo2 = 2;
		int temp;
		
		while(fibo2 < 4000000) {
			if(fibo2 % 2 == 0) {
				sum += fibo2;
			}
			temp = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = temp;
		}
			System.out.println(sum);
	}

}
