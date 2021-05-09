package circle;

public class Circle
{
	private double x;
	private double y;
	private double r;
	public Circle(double x, double y, double r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public double getR()
	{
		return r;
	}
	@Override
    public boolean equals(Object that) {
        if (that == this) return true;
        if (that == null) return false;

        if (that instanceof Circle)
        {
            Circle other = (Circle)that;
            return this.r == other.getR();
        }
        else return false;
    }
	@Override
	public int hashCode()
	{
		return (int)r;
	}
}