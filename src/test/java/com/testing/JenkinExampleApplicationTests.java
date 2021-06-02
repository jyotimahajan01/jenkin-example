package com.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JenkinExampleApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinExampleApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
