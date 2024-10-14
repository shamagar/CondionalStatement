//Display name of a day based on number
package relationalstatement;

import java.util.Scanner;

public class LunchNameOfDays 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int day;
		System.out.println("Enter a Day Number.");
		day = scan.nextInt();
		
		if(day == 1)
		{
			System.out.println("SUNDAY");
		}
		else if(day == 2)
		{
			System.out.println("MONDAY");
		}
		else if(day == 3)
		{
			System.out.println("TUESDAY");
		}
		else if(day == 4)
		{
			System.out.println("WEDNESDAY");
		}
		else if(day == 5)
		{
			System.out.println("THURSDAY");
		}
		else if(day == 6)
		{
			System.out.println("FRIDAY");
		}
		else if(day == 7)
		{
			System.out.println("SATURDAY");
		}
		else 
		{
			System.out.println("INVALID INPUT");
		}

	}

}
