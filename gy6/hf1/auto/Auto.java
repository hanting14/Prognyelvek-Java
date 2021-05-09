package auto;

import auto.utils.Color;

public class Auto
{
	private String license;
	private Color colour;
	private int maxSpeed;
	private static int c = 0;
	protected int id = 0;
	public Auto(String license, Color colour, int maxSpeed)
	{
		this.license = license;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
		this.id = c++;
	}
	public Auto()
	{
		this.license = "AAA-000";
		this.colour = Color.BLUE;
		this.maxSpeed = 120;
		this.id = c++;
	}
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	public boolean compare(Auto a, Auto b)
	{
		return a.getMaxSpeed() > b.getMaxSpeed();	
	}
}