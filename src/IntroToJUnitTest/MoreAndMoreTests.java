package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class MoreAndMoreTests {

	@Test
	  public void MultTest() {
		Runner r = new Runner();
	    assertEquals("10 x 0 = 0", r.multiply(10, 0));
	    assertEquals("10 x 10 = 100", r.multiply(10, 10));
	    assertEquals("8 x 11 = 88", r.multiply(8, 11));
	  }

	@Test
	  public void PrimeTest() {
		Runner r = new Runner();
	    assertTrue(r.isPrime(3));
	    assertTrue(r.isPrime(541));
	    assertFalse(r.isPrime(4));
	    assertFalse(r.isPrime(12));
	    assertFalse(r.isPrime(527));
	  }

	@Test
	  public void SquareTest() {
		Runner r = new Runner();
	    assertTrue(r.isSquare(4));
	    assertTrue(r.isSquare(144));
	    assertTrue(r.isSquare(64));
	    assertTrue(r.isSquare(10201));
	    assertTrue(r.isSquare(1));
	    assertFalse(r.isSquare(3));
	    assertFalse(r.isSquare(22));
	    assertFalse(r.isSquare(143));
	  }

	@Test
	  public void CubeTest() {
		Runner r = new Runner();
	    assertTrue(r.isCube(27));
	    assertTrue(r.isCube(216));
	    assertTrue(r.isCube(729));
	    assertTrue(r.isCube(1));
	    assertFalse(r.isCube(3));
	    assertFalse(r.isCube(22));
	    assertFalse(r.isCube(143));

	  }



}
