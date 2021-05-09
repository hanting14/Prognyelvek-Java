package matrix;

import java.util.ArrayList;

public class Matrix 
{
    private ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    public Matrix(int n, int m) 
	{
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<n; i++) 
		{
            matrix.add(new ArrayList<Integer>());
            for (int j=0; j<m; j++) 
			{
                matrix.get(i).add(0);
            }
        }

        this.matrix = matrix; 
    }
    public Matrix(ArrayList<ArrayList<Integer>> matrix) 
	{
        this.matrix = matrix;
    }
    public static Matrix identityMatrix(int n) 
	{
        Matrix m = new Matrix();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<n; i++) 
		{
            matrix.add(new ArrayList<Integer>());
            for (int j=0; j<n; j++) 
			{
                if (i==j) 
					matrix.get(i).add(1);
                else
                    matrix.get(i).add(0);
            }
        }
        m.setMatrix(matrix);
        return m;
    }
    public Matrix() {}
    public ArrayList<ArrayList<Integer>> getMatrix()
	{
        return matrix;
    }
    public void setMatrix(ArrayList<ArrayList<Integer>> newMatrix)
	{
        matrix = newMatrix;
    }
    public int getN() 
	{
        return matrix.size();
    }
    public int getM() 
	{
        return matrix.get(0).size();
    }
    public Matrix transposeMatrix() 
	{
        ArrayList<ArrayList<Integer>> m = this.matrix;
        ArrayList<ArrayList<Integer>> transposed = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<getN(); i++) 
		{
            transposed.add(new ArrayList<Integer>());
            for (int j=0; j<getM(); j++)
			{
                transposed.get(i).add(m.get(j).get(i));
            }
        }
        return new Matrix(transposed);
    }
    public Matrix plus(Matrix m) 
	{
        ArrayList<ArrayList<Integer>> mtx1 = this.matrix;
        ArrayList<ArrayList<Integer>> mtx2 = m.getMatrix();
        ArrayList<ArrayList<Integer>> sum = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<getN(); i++) 
		{
            sum.add(new ArrayList<Integer>());
            for (int j=0; j<getM(); j++)
			{
                sum.get(i).add(mtx1.get(i).get(j) + mtx2.get(i).get(j));
            }
        }
        return new Matrix(sum);
    }
    public Matrix minus(Matrix m) 
	{
        ArrayList<ArrayList<Integer>> mtx1 = this.matrix;
        ArrayList<ArrayList<Integer>> mtx2 = m.getMatrix();
        ArrayList<ArrayList<Integer>> sub = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<getN(); i++)
		{
            sub.add(new ArrayList<Integer>());
            for (int j=0; j<getM(); j++) 
			{
                sub.get(i).add(mtx1.get(i).get(j) - mtx2.get(i).get(j));
            }
        }
        return new Matrix(sub);
    }
    public String toString()
	{
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i=0; i<getN();i++)
		{
            for (int j=0; j<getM(); j++) 
			{
                str.append(matrix.get(i).get(j));
                if (j!=getM()-1) 
                    str.append(" ");
            }
            if (i==getN()-1)
                str.append("]");
            else 
			{
            str.append("\n");
            str.append(" ");
            }
        }
        return str.toString();
    }
}