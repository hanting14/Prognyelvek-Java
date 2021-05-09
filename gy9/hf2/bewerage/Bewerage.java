package bewerage;

public class Bewerage
{
	private String name;
	private int legalAge;
	Bewerage(String name, int legalAge) throws IllegalArgumentException
	{
		if (name.length() > 0 && legalAge > 0)
		{
			this.name = name;
			this.legalAge = legalAge;
		}
		else throw new IllegalArgumentException();
	}
	public String getName()
	{
		return name;
	}
	public int getLegalAge()
	{
		return legalAge;
	}
}