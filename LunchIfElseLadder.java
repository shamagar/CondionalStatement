//Demo of elseIf ladder 

package relationalstatement;

public class LunchIfElseLadder 
{

	public static void main(String[] args) 
	{
		int a = 23, b = 45, c = 5, d = 67;
		
		//Compare the value of a with other values
		if(a>b && a > c && a > d)
		{
			System.out.println("The gratest value from given data is "+a);
		}
		//Compare the value of b with other values
		else if(b > c && b > d)
		{
			System.out.println("The gratest value from given data is "+b);
		}
		//Compare the value of c with other values
		else if(c > d)
		{
			System.out.println("The gratest value from given data is "+c);
		}
		//Compare the value of d with other values
		else
		{
			System.out.println("The gratest value from given data is "+d);
		}	

	}

}
