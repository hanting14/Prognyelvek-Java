package geometry;

public class Rectangle implements Shape 
{
    private int a;
	private int b;
    public Rectangle(int a, int b) 
	{
        this.a = a;
		this.b = b;
    }
    public Rectangle() {}

    public int getPerimeter() 
	{
        return 2 * (a + b);
    }
    public int getArea() 
	{
        return a * b;
    }
    public String toString()
	{
        return "Teglalap oldalai: " + a + ", " + b;
    }
}