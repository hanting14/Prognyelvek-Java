package polyhedra;

public class Cube extends Prism 
{
    public Cube(int height) 
	{
        this.height = height;
    }
    @Override
    public double baseArea() 
	{
        return (height * height);
    }
    @Override
    public String toString() 
	{
        return "Cube : (a=" + height + ")";
    }
}