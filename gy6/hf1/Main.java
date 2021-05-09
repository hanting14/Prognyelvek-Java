import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import auto.Auto;
import auto.utils.Color;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			Auto[] autos = new Auto[5];
			int i = 0;
			while (myReader.hasNextLine()) 
			{
				String data = myReader.nextLine();
				String[] line = data.split(",");
				Color tmp;
				if (line[1] == "RED")
				{
					tmp = Color.RED;
				}
				else if (line[1] == "GREEN")
				{
					tmp = Color.GREEN;
				}
				else if (line[1] == "BLUE")
				{
					tmp = Color.BLUE;
				}
				autos[i] = new Auto(line[0], Color.RED, Integer.parseInt(line[2]));
				i++;
			}
			myReader.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found.");
			e.printStackTrace();
		}
	}
}