import java.util.Scanner;

public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter a second number: ");
		int num2 = input.nextInt();
		
		
		TwoIntegers twointegers = new TwoIntegers(num1, num2);
		String a = twointegers.arithmetic();
		System.out.println(a);
		
		
	}
	
}
