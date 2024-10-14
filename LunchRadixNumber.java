//Find radix of a given number in a string
//(0,1)=Binary
//(0-7)=Octal
//(0-9) && (A-F)=Hexa
//(0-9)=Decimal

package relationalstatement;

import java.util.Scanner;

public class LunchRadixNumber 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String num;
		System.out.println("Enter a number.");
		num = scan.nextLine();
		
		if(num.matches("[01]+"))
		{
			System.out.println("Binary and Radix is 2.");
		}
		else if(num.matches("[0-7]+"))
		{
			System.out.println("Octal and Radix is 8.");
		}
		else if(num.matches("[0-9A-F]+"))
		{
			System.out.println("Hexa  and Radix is 16.");
		}
		else if(num.matches("[0-9]+"))
		{
			System.out.println("Decimal and Radix is 10.");
		}
		else
		{
			System.out.println("NOT A NUMBER.");
		}
		

	}

}
