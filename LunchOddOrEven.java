package relationalstatement;

import java.util.Scanner;

public class LunchOddOrEven 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number to check Odd or Even");
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Entered number is "+ num + " and it is EVEN");
		}
		else
		{
			System.out.println("Entered number is "+ num + " and it is ODD");
		}

	}

}
