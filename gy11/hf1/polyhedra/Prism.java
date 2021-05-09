package polyhedra;

abstract class Prism 
{
    protected int height;
	
    public abstract double baseArea();
    public double volume() 
	{
        return baseArea() * height;
    }
}