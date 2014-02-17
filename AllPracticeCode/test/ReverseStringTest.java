import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ReverseStringTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReverseString() {
		ReverseString revString = new ReverseString();
		String input = "abcdefg";
		String expectedResult = "gfedcba";
		String actualResult = revString.revLoopStr(input);
		assertEquals(expectedResult, actualResult);
	}

}
