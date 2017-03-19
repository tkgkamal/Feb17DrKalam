package day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=7;
		int c=0;
		int prime=0;
		
		for(int i=2; i<a/2;i++)
		{
			c =a%i;
			if(c==0)
			{
				System.out.println("the give nuber is not a Prime number");
				prime=1;
				break;
			} 
			
		}
		if(prime==0){
			System.out.println("the given number is a prime number");
			
		}
	}

}
