package time;

import java.time.DateTimeException;

public class Time
{
	private int hour;
	private int minute;
	public Time() {}
	public Time(int hour, int minute) throws DateTimeException
	{
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60)
		{
			this.hour = hour;
			this.minute = minute;
		}
		else throw new DateTimeException("Not formal time.");
	}
	public String toString()
	{
		return hour + ":" + minute;
	}
}