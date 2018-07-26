import java.util.*;
class Simplecalculator
{
	int c;
	int d;
	int a,b;
	void cal()
	{
		Scanner n21 = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println("Enter '1' for Addition:");
		System.out.println("Enter '2' for Substraction:");
		System.out.println("Enter '3' for Multiplication:");
		System.out.println("Enter '4' for Division:");
		System.out.println("Enter '5' for Square:");
		System.out.println("Enter '6' for SquareRoot:");
		System.out.println("---------------------------------------");
		d = n21.nextInt();
		switch(d)
		{
			case 1:
			{
				System.out.println("Enter two numbers: ");
				Scanner n = new Scanner(System.in);
				a = n.nextInt();
				b = n.nextInt();
				c=a+b;
				System.out.println("The Answer is: "+c);
				break;
			}
			case 2:
			{
				System.out.println("Enter two numbers: ");
				Scanner n = new Scanner(System.in);
				a = n.nextInt();
				b = n.nextInt();
				c=a-b;
				System.out.println("The Answer is: "+c);
				break;
			}
			case 3:
			{
				System.out.println("Enter two numbers: ");
				Scanner n = new Scanner(System.in);
				a = n.nextInt();
				b = n.nextInt();
				c=a*b;
				System.out.println("The Answer is: "+c);
				break;
			}
			case 4:
			{
				System.out.println("Enter two numbers: ");
				Scanner n = new Scanner(System.in);
				a = n.nextInt();
				b = n.nextInt();
				c=a+b;
				System.out.println("The Answer is: "+c);
				break;
			}
			case 5:
			{
				System.out.println("Enter a numbers: ");
				Scanner n = new Scanner(System.in);
				a = n.nextInt();
				c=a*a;
				System.out.println("The Answer is: "+c);
				break;
			}
			case 6:
			{
				System.out.println("Enter a numbers: ");
				Scanner n = new Scanner(System.in);
				a = n.nextInt();
				double c = Math.sqrt(a);
				System.out.println("The Answer is: "+c);
				break;
			}
			default:
			{
				System.out.println("Wrong Input.");
				break;
			}
		}
	}
}
class ScientificCalculator
{
	void sinra()
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		double b = Math.toRadians(z);
		double y = Math.sin(b);
		System.out.println("The Answer is: "+y);
	}
	void cosra()
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		double b = Math.toRadians(z);
		double y = Math.cos(b);
		System.out.println("The Answer is: "+y);
	}
	void tanra()
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		double b = Math.toRadians(z);
		double y = Math.tan(b);
		System.out.println("The Answer is: "+y);
	}
	void sinin()
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		double b = Math.toRadians(z);
		double y = Math.asin(b);
		System.out.println("The Answer is: "+y);
	}
	void cosin()
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		double b = Math.toRadians(z);
		double y = Math.acos(b);
		System.out.println("The Answer is: "+y);
	}
	void tanin()
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		double b = Math.toRadians(z);
		double y = Math.atan(b);
		System.out.println("The Answer is: "+y);
	}
}
class Calculator
{
	public static void main(String args[])
	{
		Simplecalculator s = new Simplecalculator();
		ScientificCalculator m = new ScientificCalculator();
		System.out.println("---------------------------------------");
		System.out.println("Enter 1 for Simple & 2 For Scientific:-");
		System.out.println("---------------------------------------");
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		switch(n2)
		{
			case 1:
			{
				s.cal();
				break;
			}
			case 2:
			{
				System.out.println("---------------------------------------");
				System.out.println("Enter '1' for Sin:");
				System.out.println("Enter '2' for Cos:");
				System.out.println("Enter '3' for Tan:");
				System.out.println("Enter '4' for Sin^1:");
				System.out.println("Enter '5' for Cos^1:");
				System.out.println("Enter '6' for Tan^3:");
				System.out.println("---------------------------------------");
				Scanner sc3 = new Scanner(System.in);
				int n3 = sc3.nextInt();
				switch(n3)
				{
					case 1:
					{
						m.sinra();
						break;
					}
					case 2:
					{
						m.cosra();
						break;
					}
					case 3:
					{
						m.tanra();
						break;
					}
					case 4:
					{
						m.sinin();
						break;
					}
					case 5:
					{
						m.cosin();
						break;
					}
					case 6:
					{
						m.tanin();
						break;
					}
					default:
					{
						System.out.println("Wrong Input.");
						break;
					}
				}
				break;
			}
			default:
			{
				System.out.println("Wrong Input.");
				break;
			}
		}
	}
}