import java.util.*;
import exceptions.AlreadyContainedException;
import circle.Circle;

public class CheckedSet<T>
{
	private HashSet<T> data;
	public CheckedSet()
	{
		data = new HashSet<T>();
	}
	public int size()
	{
		return data.size();
	}
	public void add(T element) throws AlreadyContainedException 
	{
		if (data.contains(element))
			throw new AlreadyContainedException();
		else data.add(element);
	}
	public boolean contains(T element)
	{
		return data.contains(element);
	}
	public static void main(String[] args)
	{
		Circle a = new Circle(1,2,3);
		Circle b = new Circle(1,2,3);
		Circle c = new Circle(1,2,4);
		Circle d = new Circle(6,5,3);
		CheckedSet<Circle> ct = new CheckedSet<Circle>();
		try
		{
			ct.add(a);
			ct.add(b);
			ct.add(c);
			ct.add(d);
		}
		catch(AlreadyContainedException e)
		{
			System.out.println("One of the circles was already in the CheckedSet");
		}
		
	}
}