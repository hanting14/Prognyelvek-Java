package game.player;

import java.util.ArrayList;
import game.vehicles.Car;

public class Player
{
	private String name;
	private String IP;
	private int money;
	private ArrayList<Car> cars;
	public Player(String name, String IP, int money) throws IllegalArgumentException
	{
		if (name != null)
			this.name = name;
		else
			throw new IllegalArgumentException();
		if (IP != null && IP.length() > 0 && !(IP.contains(" ")))
			this.IP = IP;
		else
			throw new IllegalArgumentException();
		if (money >= 0)
			this.money = money;
		else
			throw new IllegalArgumentException();
	}
	public String getName()
	{
		return name;
	}
	public String getIP()
	{
		return IP;
	}
	public int getMoney()
	{
		return money;
	}
	public ArrayList<Car> getCars()
	{
		return cars;
	}
	public boolean equals(Player other)
	{
		if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Player player = (Player) other;
        return this.name == player.name 
          && this.money == player.money 
          && this.cars.equals(other.getCars());	
	}
}