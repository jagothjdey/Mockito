package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessServiceStubTest {

	@Test
	public void testfindMax() {
		BusinessService businessService =  new BusinessService(new DataServiceStub());
		int result = businessService.findMax();
		assertEquals(67, result);
	}
}


