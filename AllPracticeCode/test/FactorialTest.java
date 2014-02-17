import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FactorialTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void factorialBigValue() {
		Factorial factInstance = new Factorial();
		int nInputValue = 3;
		float nExpectedAnswer = 6;
		float nActualAnswer = factInstance.factorial(nInputValue);

		assertEquals(nExpectedAnswer, nActualAnswer, 0.01);
	}

}
