package game.vehicles;

import game.utils.VehicleException;

public class Train extends Vehicle 
{
    @Override
    public void accelerate(double difference) throws VehicleException
	{
        if (difference < 0) 
			this.accelerateCurrentSpeed(difference / 10);
		else 
			this.accelerateCurrentSpeed(difference);
    }
}