import utils.Vector;

public class Main
{
	public static void main(String[] args)
	{
		Vector a = new Vector(3,5);
		Vector b = new Vector(2,7);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println("Osszeguk: " + a.add(b).toString());
		System.out.println("Kivonas: " + a.minus(b).toString());
		System.out.println("Skalaris szorzat: " + a.skalarMult(b));
		System.out.println("a 2x: " + a.skalar(2).toString());
	}
}