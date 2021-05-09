import geometry.Square;
import geometry.Rectangle;
import geometry.Circle;
import java.util.*;

class Main 
{
    public static void main(String[] args) 
	{
        Square sqr = new Square(10);
        System.out.println(sqr);
        System.out.println(sqr.getArea());
        System.out.println(sqr.getPerimeter());
		Rectangle rct = new Rectangle(10, 20);
        System.out.println(rct);
        System.out.println(rct.getArea());
        System.out.println(rct.getPerimeter());
		Circle crc = new Circle(10);
        System.out.println(crc);
        System.out.println(crc.getArea());
        System.out.println(crc.getPerimeter());
    }
}
