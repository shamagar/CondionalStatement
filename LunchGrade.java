//Find the grade

package relationalstatement;

import java.util.Scanner;

public class LunchGrade 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int m1, m2, m3, m4, m5, sum;
		System.out.println("Enter the score marks of five subjects.");
		m1 = scan.nextInt();
		m2 = scan.nextInt();
		m3 = scan.nextInt();
		m4 = scan.nextInt();
		m5 = scan.nextInt();
		
		sum = m1 + m2 + m3 + m4 + m5;
		
		float average =(float) sum / 5;
		
		if(average >= 90)
		{
			System.out.println("Your total is "+ average +" and your grade is A.");
		}
		else if(average >= 90)
		{
			System.out.println("Your total is "+ average +" and your grade is A.");
		}
		else if(average >= 80 && average < 90)
		{
			System.out.println("Your total is "+ average +" and your grade is B.");
		}
		else if(average >= 70 && average < 80)
		{
			System.out.println("Your total is "+ average+" and your grade is C.");
		}
		else
		{
			System.out.println("Your total is "+ average + " and grade is F." );
		}
		
	}

}
