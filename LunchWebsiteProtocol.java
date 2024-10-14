//Find type of web site and the protocol used

package relationalstatement;

import java.util.Scanner;

public class LunchWebsiteProtocol 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a URL.");
		String url = scan.nextLine();
		
		//finding the name of protocol
		String protocol = url.substring(0, url.indexOf(":"));
		
		if(protocol.equals("http"))
		{
			System.out.println("Hypertext Transfer Protocol.");
		}
		else if(protocol.equals("ftp"))
		{
			System.out.println("File Transfer Protocol.");
		}
		else if(protocol.equals("stp"))
		{
			System.out.println(" Transfer Protocol.");
		}
		else
		{
			System.out.println("Invalid Input..");
		}
		
		System.out.println("************");
		//Finding the name of website
		
		String ext = url.substring(url.lastIndexOf(".")+1);
		
		if(ext.equals("com"))
		{
			System.out.println("Its a commerical.");
		}
		else if(ext.equals("gov"))
		{
			System.out.println("Its a Government.");
		}
		else if(ext.equals("org"))
		{
			System.out.println("Its a Organisation.");
		}
		else if(ext.equals("net"))
		{
			System.out.println("Its a Network.");
		}
		else
		{
			System.out.println("Invalid Input.");
		}

	}

}
