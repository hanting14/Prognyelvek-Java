package game.vehicles;

import game.utils.VehicleException;

public class Car extends Vehicle implements Comparable<Car>
{
	private int maxSpeed;
	private int money;
	public Car(int maxSpeed, int money)
	{
		this.maxSpeed = maxSpeed;
		this.money = money;
	}
	public int getMoney()
	{
		return money;
	}
	@Override
	public String toString()
	{
		return "Auto: " + this.id + " " + this.maxSpeed + " " + this.money;
	}
	@Override
	public void accelerate(double difference) throws VehicleException
	{
		if (this.getSpeed() + difference < this.maxSpeed)
			accelerateCurrentSpeed(difference);
	}
	@Override
	public int compareTo(Car other)
	{
		if(this.maxSpeed == other.maxSpeed)
			return Integer.compare(this.money, other.money);
		else
			return Integer.compare(this.maxSpeed, other.maxSpeed);
	}
}