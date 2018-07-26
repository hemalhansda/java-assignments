class patternA
{
	public static void main(String args[])
	{
		char[] c = {'A', 'B', 'C', 'D', 'E', 'F'};
		int i, j;

		for (j = c.length-1; j >= 0; j--)
		{
			for (int k = 0; k <= j; k++)
			{
				System.out.print(c[k]);
			}
			for (int k = 0; k < (c.length-j)*2 - 1; k++)
			{
				System.out.print(" ");
			}
			for (i = j; i >= 0; i--)
			{
				System.out.print(c[i]);
			}
			System.out.println();
		}
	}
}