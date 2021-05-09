import java.util.ArrayList;

class Main
{
	public static ArrayList<Integer> getDividers(int number)
	{
		ArrayList<Integer> dividers = new ArrayList<Integer>();
		for (int i = 2; i<number; i++)
		{
			if (number % i == 0)
				dividers.add(i);
		}
		return dividers;
	}
	public static boolean perfectNumber(ArrayList<Integer> dividers, int number)
	{
		int sum = 0;
		for (int iterator : dividers)
		{
			sum += iterator;
		}
		sum++;
		return sum == number;
	}
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		if (perfectNumber(getDividers(number), number))
			System.out.println("Tokeletes szam");
		else System.out.println("Nem az");
	}
}