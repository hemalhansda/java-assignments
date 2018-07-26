class AV{
	int a;
	int b;
	AV(int s)
	{
		a=s*s;
		b=s*s*s;
		System.out.println("The Area of the Square is: " +a);
		System.out.println("The Volume of the Square is: "+b);
	}
}
class Square
{
	public static void main(String args[])
	{
		AV n = new AV(5);
	}
}