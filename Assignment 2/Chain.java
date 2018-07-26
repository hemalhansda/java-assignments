class A
{
	int a;
	int b;
	A(int x, int y)
	{
		a=x;
		b=y;
		System.out.println("Constructor - A");
	}
}
class B extends A
{
	int c;
	B(int x, int y, int z)
	{
		super(x,y);
		c=z;
		System.out.println("Constructor - B");
	}
}
class C extends B
{
	int d;
	C(int x,int y, int z, int w)
	{
		super(x,y,z);
		d=w;
		System.out.println("Constructor - C");
	}
}
class Chain
{
	public static void main(String args[])
	{
		C ch = new C(2,3,4,5);
	}
}