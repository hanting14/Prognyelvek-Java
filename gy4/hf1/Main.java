import java.util.ArrayList;

import matrix.Matrix;

class Main 
{
    public static void main(String[] args) 
	{    
        Matrix a = new Matrix(3, 4);
        System.out.println(a.toString());
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l3.add(7);
        l3.add(8);
        l3.add(9);
        al.add(l1);
        al.add(l2);
        al.add(l3);
        Matrix m = new Matrix(al);
        System.out.println(m.getN());
        System.out.println(m.getM());
        System.out.println(m.toString());
        System.out.println(m.transposeMatrix());
        System.out.println((m.plus(Matrix.identityMatrix(3))).toString());
        System.out.println((m.minus(Matrix.identityMatrix(3))).toString());
    }
}