import polyhedra.Cylinder;
import polyhedra.Cube;
import java.util.*;

class Main 
{
    public static void main(String[] args) 
	{
        Cylinder cy = new Cylinder(20,30);
        System.out.println(cy);
        System.out.println(cy.baseArea());
        System.out.println(cy.volume());
        Cube cu = new Cube(10);
        System.out.println(cu);
        System.out.println((int)cu.baseArea());
        System.out.println((int)cu.volume());
    }
}
