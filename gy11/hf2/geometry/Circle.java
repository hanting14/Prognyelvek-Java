package geometry;

public class Circle implements Shape {
    private int r;
	private final int PI = 3;
    public Circle(int r) 
	{
        this.r = r;
    }
    public Circle() {}

    public int getPerimeter() 
	{
        return 2 * r * PI;
    }
    public int getArea() 
	{
        return r * r * PI;
    }
    public String toString()
	{
        return "Kor sugara: " + r;
    }
}