import java.util.Scanner;
class Addition
{
	int x;
	void add(int a, int b)
	{
		x=a+b;
		System.out.println("The Sum of 2 numbers : "+x);
	}
	void add(int a, int b, int c)
	{
		x=a+b+c;
		System.out.println("The Sum of 3 numbers : "+x);
	}
	void add(int a, int b, int c, int d)
	{
		x=a+b+c+d;
		System.out.println("The Sum of 4 numbers : "+x);
	}
}
class Add
{
	public static void main(String args[])
	{
		System.out.println("Enter the numbers: ");
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		int i = sc.nextInt();
		int o = sc.nextInt();
		int p = sc.nextInt();
		Addition ad = new Addition();
		ad.add(u,i,o,p);
	}
}