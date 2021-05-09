class Main
{
	public static long max(long[] numbers)
	{
		long max = numbers[0];
		for (int i = 1; i<numbers.length; i++)
		{
			if (max < numbers[i])
			{
				max = numbers[i];
			}
		}
		return max;
	}
	public static boolean biggestDivider_bool(long[] numbers, long divider)
	{
		for (int i = 0; i<numbers.length; i++)
		{
			if (numbers[i] % divider != 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		long[] numbers = new long[args.length];
		long biggestDivider = 0;
		for (int i = 0; i<args.length; i++)
		{
			numbers[i] = Long.parseLong(args[i]);
		}
		for (int i = 1; i<=max(numbers); i++)
		{
			if (biggestDivider_bool(numbers, i))
				biggestDivider = i;
		}
		System.out.println(biggestDivider + " a legnagyobb kozos oszto."); 
	}
}