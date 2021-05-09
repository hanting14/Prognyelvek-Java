import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import pizza.Pizza;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			int sum = 0;
			File myObj = new File(args[0]);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) 
			{
				String data = myReader.nextLine();
				String[] line = data.split(" ");
				String[] toppings = new String[line.length-1];
				for (int i = 0; i<line.length-1; i++)
				{
					toppings[i] = line[i+1];
				}
				Pizza tmp = new Pizza(Integer.parseInt(line[0]),toppings);
				sum += tmp.getTime();
			}
			System.out.println(sum);
			myReader.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found.");
			e.printStackTrace();
		}
		catch (TypeNotPresentException t) 
		{
			System.out.println("The input file's format is wrong.");
			t.printStackTrace();
		}
	}
}