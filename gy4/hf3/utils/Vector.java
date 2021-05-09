package utils;

import java.util.*;
import java.lang.StringBuilder;

public class Vector
{
	public int x;
	public int y;
	public Vector() {}
	public Vector(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public Vector add(Vector that)
	{
		Vector sum = new Vector();
		sum.x = this.x + that.x;
		sum.y = this.y + that.y;
		return sum;
	}
	public Vector minus(Vector that)
	{
		Vector sum = new Vector();
		sum.x = this.x - that.x;
		sum.y = this.y - that.y;
		return sum;
	}
	public Vector skalar(int s)
	{
		Vector sum = new Vector();
		sum.x = this.x * s;
		sum.y = this.y * s;
		return sum;
	}
	public int skalarMult(Vector that)
	{
		int sum = this.x * that.x;
		sum += this.y * that.y;
		return sum;
	}
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		str.append("Vektor: ");
		str.append("(");
		str.append(this.x);
		str.append(",");
		str.append(this.y);
		str.append(")");
		return str.toString();
	}
}