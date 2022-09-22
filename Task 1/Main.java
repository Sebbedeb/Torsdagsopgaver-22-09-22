class Main
{
	public static void main (String[] args) 
	{
		String name="ANNA";
		char[] emordnilaP = new char['a'];
		char[] split;
	
		split=name.toCharArray();

		for(int i=0;i<split.length;i++)
		{
			emordnilaP[i]=split[split.length-1-i];
		}
		String emordnilaPStr = String.valueOf(emordnilaP);

		if(emordnilaPStr==name)
		{
			System.out.println(emordnilaPStr);			
			System.out.println(name);
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
}
/*Jeg kan simpelthen ikke få den til at forstå, at name og emordnilaPStr 
er ens, selvom de er... sikkert fordi at emordnilaPStr stadigvæk er en 
Char[].*/