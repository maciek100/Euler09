package euler09;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/* Euler 9.
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 => (9 + 16 + 25 = 50).
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
// correct solution = 31875000
public class Euler09 {
	// Very brute force approach
	public static long triplet (int linearSum) {
		long product = 0L;
		for (int a = 1; a < linearSum/2; a++) {
			for (int b = a; b < linearSum/2; b++) {
				for (int c = b; c < linearSum/2; c++) {
					if (condition(a, b, c, linearSum)) {
						product = a * b * c;
						System.out.printf("Pythagorean [%d,%d,%d] triplet = %d\n",
								a, b, c, product);
					}
				}
			}
		}
		return product;
	}

	private static boolean condition(int a, int b, int c, int sum) {
		return a * a + b * b  == c * c  && a + b + c == sum;
	}

	@Test
	public void conditionTest() {
		int sum = 3 + 4 + 5;
		assertTrue("", condition(3,4,5, sum));
	}
	@Test
	public void testEuler09 () {
		long sumOfSquares = 31875000L;
		assertEquals("", sumOfSquares, triplet(1000));
	}

}
