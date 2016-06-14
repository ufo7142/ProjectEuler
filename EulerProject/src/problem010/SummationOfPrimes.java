package problem010;

public class SummationOfPrimes {

	   public static void main(String[] args) {
					
	        long number = 3;
	        long sum = 2;
	        long limit = 2000000;
	        
	        while(number <= limit) {
	            if(isPrime(number)) {
	                sum += number;
	            }
	            number+=2;
	        }
	        
	        System.out.println(sum);
	    
	    }
	    
	    public static boolean isPrime(long number) {
	    	
	        if(number % 2 == 0) {
	            return false;
	        }
	        
	        long i = 3;
	        
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