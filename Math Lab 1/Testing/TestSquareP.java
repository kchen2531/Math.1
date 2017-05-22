import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author kchen2531
 *
 */
public class TestSquareP {

	@Test
	public void testSquare() {
		assertEquals(8,
				Geometry.squarePerimeter(2),
				.0);
		assertEquals(8.4,
				Geometry.squarePerimeter(2.1),
				.0);
	}
	@Test
	public void testPentagon() {
		assertEquals(35,
				Geometry.pentagonPerimeter(7),
				.0);
		assertEquals(35.5,
				Geometry.pentagonPerimeter(7.1),
				.0);
	}
	@Test
	public void testHexagon() {
		assertEquals(30,
				Geometry.hexagonPerimeter(5),
				.0);	
		assertEquals(30.6,
				Geometry.hexagonPerimeter(5.1),
				.1);
	}
	@Test
	public void testOctagon() {
		assertEquals(16,
				Geometry.octagonPerimeter(2),
				.0);
		assertEquals(16.8,
				Geometry.octagonPerimeter(2.1),
				.0);
	}
	@Test
	public void rectanglePerimeter() {
		assertEquals(14,
				Geometry.rectanglePerimeter(4,3),
				.0);
		assertEquals(14.4,
				Geometry.rectanglePerimeter(4.1,3.1),
				.1);
	}
	@Test
	public void testCircumference() {
		assertEquals(12.566370614359172,
				Geometry.circumference(2),
				.0000000000001);
	}

}
