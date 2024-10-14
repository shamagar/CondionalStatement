package relationalstatement;

import java.util.Scanner;

public class LunchYoungOrNot 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age.");
		int age = sc.nextInt();
		
		if( age < 14)
		{
			System.out.println("Your are too Young.");
		}
		else if(age >= 14 && age <= 55)
		{
			System.out.println("Your are Young.");
		}
		else
		{
			System.out.println("You are Not Young.");
		}

	}

}
