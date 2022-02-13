/**
 * 
 * @author vanessa
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook gb1, gb2;
	
	/**
	 * @throws Exception
	 */
	
	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		gb1.addScore(80.0);
		gb1.addScore(70.0);
		gb1.addScore(90.0);
		
		gb2.addScore(80.0);
		gb2.addScore(90.0);
		gb2.addScore(60.0);
	}
	/**
	 * 
	 * @throws Exception
	 */

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
	}
	/**
	 * test method
	 */
	
	@Test
	void testAddScore() {
		
		assertTrue(gb1.toString().equals("80.0 70.0 90.0 "));
		assertTrue(gb2.toString().equals("80.0 90.0 60.0 "));
		
		assertEquals(3, gb1.getScoreSize());
		assertEquals(3, gb2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(240.0, gb1.sum());
		assertEquals(230.0, gb2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(70.0, gb1.minimum());
		assertEquals(60.0, gb2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(170.0, gb1.finalScore());
		assertEquals(170.0, gb2.finalScore());
	}
	
	@Test
	void testGetScoreSize() {
		assertEquals(3, gb1.getScoreSize() );
		assertEquals(3, gb2.getScoreSize() );
	}
	
	@Test
	void testToString() {
		assertTrue(gb1.toString().equals("80.0 70.0 90.0 "));
		assertTrue(gb2.toString().equals("80.0 90.0 60.0 "));
	}

}