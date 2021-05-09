package main;

import java.io.*;
import game.player.Player;
import game.vehicles.Car;

public class Main
{
	public static Player loadPlayerFromFile(String playerName)
	{
		File input = new File("users/" + playerName + ".txt");

		String[] data = null;
		try (BufferedReader bf = new BufferedReader(new FileReader(input)))
		{
			String line = bf.readLine();
			data = line.split(" ");
			int balance;
			 try 
			 {
				balance = Integer.parseInt(data[1]);
			 } 
			 catch (NumberFormatException e) 
			 {
				balance = 0;
			 }
			 return new Player(playerName, data[0], balance);
		} 
		catch (IOException e) 
		{
			System.out.println("IO error occured: " + e.getMessage());
		}
		return null;
	}
	public static void main(String[] args) 
	{
        Player Daniel = loadPlayerFromFile("Daniel");
        Player Peter = loadPlayerFromFile("Peter");
        Player Richard = loadPlayerFromFile("Richard");
        Player Tamas = loadPlayerFromFile("Tamas");
        Player Zorror = loadPlayerFromFile("Zorror");
        Car a = new Car(400,100);
        Car b = new Car(300,1000);
        Car c = new Car(200,2000);
        Car d = new Car(100,300);
        Car e = new Car(300,150);
    }
	
}