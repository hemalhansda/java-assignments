import java.util.*;
class length
{
	public static void main (String args[])
	{
		System.out.println();
		System.out.print("Enter the String: ");
		Scanner n = new Scanner(System.in);
		String str = n.nextLine();
		int len = str.length();
		System.out.println("-----------------------------------");
		char[] a =  new char[len];
		System.out.println("Enter 1 for String length / Enter 2 for String reverse: ");
		Scanner m = new Scanner(System.in);
		int x = m.nextInt();
		switch(x)
		{
			case 1:
			{
				System.out.println("The length is : "+str.length());
				break;
			}
			case 2:
			{
				System.out.println("The Reverse of the string is : ");
				for(int i=len-1;i>=0;i--)
				{
					a[i]=str.charAt(i);
					System.out.print(a[i]);
				}
				break;
			}
			default:
			{
				System.out.println("Wrong Input!");
			}
		}
	}
}