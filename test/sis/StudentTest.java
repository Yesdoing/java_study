package sis;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class StudentTest {

	@Test
	public void test() {
		Student studuent = new Student("재성");
		String studentName = studuent.getName();
		assertEquals("재성", studentName);
	}
	
	@Test
	public void calculate() throws Exception {
		Calculator cal = new Calculator();
	}

}
