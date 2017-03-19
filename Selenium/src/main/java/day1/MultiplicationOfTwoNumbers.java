package day1;

public class MultiplicationOfTwoNumbers {
	
	public int multiplication2numbers(int a, int b)
	{
	return a*b;
	}

	public static void main(String args[])
	{
		MultiplicationOfTwoNumbers mul= new MultiplicationOfTwoNumbers();
		int c= mul.multiplication2numbers(10,5);
		System.out.println("multiplication of two numbers " +c);
		
		
	}
}
