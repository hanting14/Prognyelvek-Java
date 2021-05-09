package circle;

import circle.utils.ColouredPoint;

public class ColouredCircle extends Circle
{
	private static ColouredPoint o;
	public ColouredCircle(ColouredPoint o)
	{
		this.o = o;
	}
	public ColouredPoint.Colour getColour()
	{
		return o.getColour();
	}
}