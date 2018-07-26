class Calcu
{
	static int r = 2; //static variable
	int a = 1;	//non-static variable
	Calcu(int x, int y)
	{
		r=r+2; //The Value of r is changing in every inputs, proves static
		r++;
		a=a+1; 
		a++;
		System.out.println("r = "+r);
		System.out.println("a = "+a);
	}
}
class Stat
{
	public static void main(String args[])
	{
		Calcu ab = new Calcu(1,2);
		Calcu ac = new Calcu(1,1);
		Calcu ad = new Calcu(4,2);
	}
}