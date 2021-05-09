import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import circle.Circle;

public class Tests
{
	@Test
	public void test_SameR() {
		Circle a = new Circle(1,2,3);
		Circle b = new Circle(3,4,3);
		assertTrue(a.equals(b) && b.equals(a));
		assertTrue(a.hashCode() == b.hashCode());
	}
	@Test
	public void test_DifferentR() {
		Circle a = new Circle(1,2,4);
		Circle b = new Circle(1,2,3);
		assertFalse(a.equals(b) && b.equals(a));
		assertTrue(a.hashCode() != b.hashCode());
	}
	@Test
	public void test_SameObject() {
		Circle a = new Circle(1,2,4);
		Circle b = a;
		assertTrue(a.equals(b) && b.equals(a));
		assertTrue(a.hashCode() == b.hashCode());
	}
	@Test
	public void test_DifferentInstance() {
		Circle a = new Circle(1,2,4);
		Object b = new Object();
		assertFalse(a.equals(b) && b.equals(a));
		assertTrue(a.hashCode() != b.hashCode());
	}
}