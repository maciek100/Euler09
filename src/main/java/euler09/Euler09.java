package euler09;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/* Euler 9.
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
// correct solution = 31875000
public class Euler09 {

	public static long triplet (int looked) {
		long result = 0L;
		for (int a = 1; a < looked; a++) {
			for (int b = a; b < looked; b++) {
				for (int c = b; c < looked; c++) {
					if (a * a + b * b == c * c && a + b + c == looked) {
						result = a * b * c;
						System.out.printf("Pythagorean [%d,%d,%d] triplet = %d\n",
								a,b,c,result);
					}
				}
			}
		}
		return result;
	}

	@Test
	public void testEuler09 () {
		long correctOne = 31875000L;
		assertEquals("", correctOne, triplet(1000));
	}

}
