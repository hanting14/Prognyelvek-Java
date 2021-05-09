package geometry;

public class Square implements Shape 
{
    private int a;
    public Square(int a) 
	{
        this.a = a;
    }
    public Square() {}

    public int getPerimeter() 
	{
        return 4 * a;
    }
    public int getArea() 
	{
        return a * a;
    }
    public String toString()
	{
        return "Negyzet oldala: " + a;
    }
}