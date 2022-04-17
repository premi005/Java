public class PrimeOrNot
{
    static String primeOrNot(int a) {
        int count = 0;
        for(int i = 1; i <= a; i++) {
            if(a % i == 0) {
                count++;
            } 
        }
        if(count == 2) {
            return "It is a prime number";
        }    
        else {
            return "It is not a prime number";
        }    
	}
	
	public static void main(String[] args) {
	    int a = 67;
	    System.out.println(primeOrNot(a));
	}
}
