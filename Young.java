// program:  if the age is 28, display as I am Young,  or else I am not Young.


import java.util.Scanner;

public class Young
{
	public static void main(String[] args)
	{
		int age;
		System.out.println("Enter the age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
				
	
		if(age == 28)
		{
			System.out.println("I am Young");
		}	
		else
		{
			System.out.println("I am not Young");
		}
	}
}