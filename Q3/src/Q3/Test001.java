package TEST003;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test001 {

	Triangle firstone = new Triangle(3.0,4.0,5.0);
	Triangle secondone = new Triangle(9.0,12.0,15.0);
	
	
	
	
	@Test
	public void getPerimeter(){
		assertTrue(firstone.getPerimeter() == 12.0);
		assertFalse(firstone.getPerimeter() == 36.0);
		
		
		
		assertTrue(secondone.getPerimeter() == 12.0);
		assertFalse(secondone.getPerimeter() == 69.0);
	
	}
	@Test
	public void getArea(){
		assertTrue(firstone.getArea() == 6.0);
		assertFalse(firstone.getArea() == 9.0);
		
		
		assertTrue(firstone.getArea() == 54.0);
		assertFalse(firstone.getArea() == 36.0);
	}
	
}
