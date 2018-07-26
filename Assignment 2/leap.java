import java.util.*;
class leap
{
	public static void main (String args[])
	{
		System.out.println("Enter the year: ");
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		if(a%4==0||a%400==0)
		{
			System.out.println("The Year you have entered is the Leap Year.");
		}
		else
		{
			System.out.println("The Year you have entered is not a Leap Year.");
		}
	}
}