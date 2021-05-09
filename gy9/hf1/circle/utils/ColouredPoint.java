package circle.utils;

public class ColouredPoint extends Point
{
	public enum Colour 
	{
	  RED, GREEN, BLUE
	}
	private Colour color;
	public Colour getColour()
	{
		return color;
	}
	public void setColour(Colour color)
	{
		this.color = color;
	}
}