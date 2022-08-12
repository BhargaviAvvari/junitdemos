package com.testcases.demo.check;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.vfislk.training.User;

class UserTest {
	User user;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		user = new User();
	}

	@AfterEach
	void tearDown() throws Exception {
		user = null;
	}

	
	  @Tag("greet") 
	  @Test
	  @DisplayName("Testing greet")
	  void testGreet() {
	  assertEquals("great name p ", user.greet("p")); 
	  }
	 
@Test
@DisplayName("Testing showFruits")
void testshowFruits() {
	List<String> fruits=Arrays.asList("orange","mango","Apple");
	assertEquals( fruits,user.showFruits() );
}
@Test
@DisplayName("Testing showFruits")
void testFruitsLength() {
	assertEquals(3,user.showFruits().size() );
}



}
