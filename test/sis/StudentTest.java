package sis;

import static org.junit.Assert.*;

import org.junit.Test;

import sis.studentinfo.Student;


public class StudentTest {

	@Test
	public void test() {
		Student studuent = new Student("재성");
		String studentName = studuent.getName();
		assertEquals("재성", studentName);
	}
	

}
