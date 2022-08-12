package com.testcases.trail;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.vfislk.exceptions.InvalidNumException;
import com.vfislk.exceptions.NegValueException;
import com.vfislk.training.Student;

class StudentTest {
	Student student;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	@Test
	void testCalcTotal() throws NegValueException {
		assertEquals(100, student.calcTotal(10, 50, 40));
	}

	@Test
	@DisplayName("testing calcTotal")
	void testcalcTotal() throws NegValueException {
		assertEquals(220, student.calcTotal(90, 60, 70));
	}

	@Test
	@DisplayName("testing negative value")
	void testNegTotal() {
		assertThrows(NegValueException.class, () -> student.calcTotal(-10, 90, 90));
	}

	@Test
	@DisplayName("testing marks greater than 100")
	void testGreaterTotal() {
		assertThrows(InvalidNumException.class, () -> student.calcTotal(1020, 50, 30));
	}

	@Test
	@DisplayName("Testing grade A")
	void testGetGradeA() {
		int[] marks = { 90, 95 };
		assertEquals("A", student.getGrades(marks));
	}

	@Test
	@DisplayName("Testing grade B")
	void testGetGradeB() {
		int[] marks = { 80, 90 };
		assertEquals("B", student.getGrades(marks));
	}

	@Test
	@DisplayName("Testing grade C")
	void testGetGradeC() {
		int[] marks = { 70, 80 };
		assertEquals("C", student.getGrades(marks));
	}

	@Test
	@DisplayName("Testing grade D")
	void testGGradeD() {
		int[] marks = { 50, 60 };
		assertEquals("D", student.getGrades(marks));
	}
@Tag("fail")
	@Test
	@DisplayName("Testing Fail")
	void testFail() {
		int[] marks = { 45, 45 };
		assertEquals("fail", student.getGrades(marks), "fail");
	}

	@Test
	@DisplayName("Testing negative marks")
	void testNegative() {
		int[] marks = { -50, 60 };
		assertThrows(InvalidNumException.class, () -> student.getGrades(marks));
	}

	@Test
	@DisplayName("Testing greater marks")
	void testGreater() {
		int[] marks = { 150, 60 };
		assertThrows(InvalidNumException.class, () -> student.getGrades(marks));
	}

	@Test
	@DisplayName("Testing null marks  array")
	void testNullArray() {
		int[] marks = null;
		assertNull(student.getGrades(marks));
	}
}
