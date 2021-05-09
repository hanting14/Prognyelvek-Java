package pizza;

import time.Time;
import java.lang.TypeNotPresentException;
import java.util.*;

public class Pizza
{
	private final double d;
	private final String[] toppings;
	private final Time making;
	private final Time delivering;
	private final ArrayList<String> toppingTypes = new ArrayList<String>();
	private int makeTime;
	public Pizza(double d, String[] toppings) throws TypeNotPresentException
	{
		toppingTypes.add("beef");
		toppingTypes.add("cheese");
		toppingTypes.add("corn");
		toppingTypes.add("fish");
		toppingTypes.add("ham");
		toppingTypes.add("mushroom");
		toppingTypes.add("salami");
		toppingTypes.add("tomato");
		if (d < 0)
			throw new TypeNotPresentException("bad parameter", null);
		this.d = d;
		this.toppings = toppings;
		int top = 0;
		for (int i = 0; i<toppings.length; i++)
		{
			if (!(toppingTypes.contains(toppings[i])))
				throw new TypeNotPresentException("bad parameter", null);
			top += toppings[i].length();
		}
		int timeSum = top*(int)d;
		this.makeTime = timeSum;
		int hour = 0;
		while (timeSum - 60 > 0)
		{
			timeSum -= 60;
			hour++;
		}
		this.making = new Time(hour, timeSum);
		this.delivering = new Time();
	}
	public int getTime()
	{
		return makeTime;
	}
}