//Check leap year or not 
package relationalstatement;

import java.util.Scanner;

public class LunchLeapYear 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.println("Enter a year to check a leap year OR Not.");
		year = sc.nextInt();
		
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					System.out.println("Entered year is "+ year + " and it is a leap year.");
				}
				else 
				{
					System.out.println("Entered year is "+ year + " and it is NOT a leap year.");
				}
				
			}
			else
			{
				System.out.println("Entered year is "+ year + " and it is a leap year.");
			}
			
		}
		else
		{
			System.out.println("Entered year is "+ year + " and it is  NOT a leap year.");
		}

	}

}
