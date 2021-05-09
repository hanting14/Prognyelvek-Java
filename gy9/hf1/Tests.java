import org.junit.Test;
import static org.junit.Assert.assertTrue;

import circle.ColouredCircle;
import circle.utils.ColouredPoint;

public class Tests
{
	@Test
	public void ColouredPointTest()
	{
		ColouredPoint cp = new ColouredPoint();
		cp.setColour(ColouredPoint.Colour.RED);
		assertTrue(cp.getColour() == ColouredPoint.Colour.RED);
	}
	@Test
	public void ColouredCircleTest()
	{
		ColouredPoint cp = new ColouredPoint();
		cp.setColour(ColouredPoint.Colour.RED);
		ColouredCircle cc = new ColouredCircle(cp);
		assertTrue(cc.getColour() == ColouredPoint.Colour.RED);
	}
}