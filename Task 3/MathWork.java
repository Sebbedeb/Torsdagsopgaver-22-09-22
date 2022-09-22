
Random nextInt = new Random();
class MathWork
{
	public int[] arr = {1,1,1,2,2,3,3,3,4,5,5,5,6,6,7,8,8,9,9,10};
	MathWork()
	{}

	public void divisible(int a)
	{
		for (int i=0;i<101;i++)
		{
			if(i%a==0)
				System.out.println(i);
		}
	}
	public int getRandom()
	{
		return int Random(arr);

	}
}
//Kan ikke hente "Random."