class Prime2
{
	public static void main(String args[])
	{
		int n = 1000;
		int a;
		System.out.println("The Prime numbers 1-1000 are:-");
		for(int i=1;i<n;i++)
		{	
			a=1;
			for(int j=2;j<i;j++)
			{	
				if(i%j==0)
				{	
					a = 2;
					break;
				}
			}
			if(a==1)
			{
				System.out.println(+i);
			}
		}
	}
}