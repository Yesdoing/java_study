package stringcalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	
	@Test
	public void 기본연산자_덧셈() throws Exception {
		assertEquals(3, cal.add("1,2"));
		assertEquals(3, cal.add("1,1:1"));
		assertEquals(0, cal.add(""));
	}
	
	@Test
	public void 특수연산자_덧셈() throws Exception {
		assertEquals(6, cal.add("//;\n1;2;3"));
	}
	
	@Test(expected = RuntimeException.class)
	public void 음수_글자_입력() throws Exception {
		cal.add("-1,1,1");
	}

}
