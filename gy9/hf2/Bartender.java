import guests.*;
import bewerage.Bewerage;

public class Bartender
{
	public boolean order(Bewerage bew, Guest g)
	{
		if (bew.getLegalAge() == 18 && (g instanceof Minor))
			return false;
		else return true;
	}
}