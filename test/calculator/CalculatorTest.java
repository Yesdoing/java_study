package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
	}
	
	@Test
	public void add() {
		int result = cal.add(2, 8);
		assertEquals(10, result);
	}
	
	@Test
	public void sub() throws Exception {
		int result = cal.sub(2, 1);
		assertEquals(1, result);
	}
	
	@Test
	public void mul() throws Exception {
		int result = cal.mul(2, 4);
		assertEquals(8, result);
	}

}
