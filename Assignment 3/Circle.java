class Area
{
	double cr,cy;
	static double pi = 3.14;
	void areaOfCircle(int r)
	{
		cr=pi*(r*r);
		System.out.println("The Area of the Circle: "+cr);
	}
	void areaOfCylinder(int r, int h)
	{
		cy=cr=2*pi*(r*r)*h;
		System.out.println("The Area of the Cylinder: "+cr);
	}
}
class Circle
{
	public static void main(String args[])
	{
		Area a = new Area();
		a.areaOfCircle(5);
		a.areaOfCylinder(6,12);
		
	}
}