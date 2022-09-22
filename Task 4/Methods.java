class Methods
{
	Methods()
	{}

	public void fibonacci(int a, int b)
	{
		int aPrev= 0;
		while(a<1000)
		{
			System.out.println(a +"\t");
			a+=aPrev;
			aPrev=b;
			b=a;
		}
	}
}