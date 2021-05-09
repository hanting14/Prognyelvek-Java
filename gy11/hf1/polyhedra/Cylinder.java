package polyhedra;

public class Cylinder extends Prism 
{
    private final double PI = 3.14;
    private int radius;
    public Cylinder(int height, int radius) 
	{
        this.height = height;
        this.radius = radius;
    }
    @Override
    public double baseArea() 
	{
        return (radius * radius * PI);
    }
    @Override
    public String toString() 
	{
        return "Cylinder: (m=" + height + " , r=" + radius + ")";
    }
}