package game.vehicles;

import game.utils.VehicleException;

public abstract class Vehicle
{
	private static int c = 0;
	protected int id = 0;
	private double currentSpeed;
	public Vehicle() 
	{
        this.id = c++;
    }
	public double getSpeed()
	{
		return currentSpeed;
	}
	protected final void accelerateCurrentSpeed(double difference) throws VehicleException
	{
		if (this.currentSpeed + difference < 0)
            throw new VehicleException("Megallt az auto.");
		else
			this.currentSpeed += difference;
	}
	public void accelerate(double difference) throws VehicleException { }
}