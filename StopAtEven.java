//Question : The user gives input number, till even number it will receives input and if odd njumber is entered, stop taking next input and display the total number of inputs taken.



import java.util.Scanner;

public class StopAtEven
{
	public static void main(String[] args)
	{
		int n = 0, a, i,count = 0;
		System.out.println("Enter the numbers");	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
				
		while(n%2 == 0)
		{
			//System.out.println(n);
			n = sc.nextInt();
			count++;
		}

		//int c = n.length();	
		System.out.println("The total numbers enters are:"+ (count+1));
	}
}