package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessServiceMockTest {

	@Test
	public void testfindMax() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.getData()).thenReturn(new int[] {24,56,68});
		BusinessService businessService =  new BusinessService(dataServiceMock);
		int result = businessService.findMax();
		assertEquals(68, result);
	}
	
	@Test
	public void testfindMax_ForOneValue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.getData()).thenReturn(new int[] {24});
		BusinessService businessService =  new BusinessService(dataServiceMock);
		int result = businessService.findMax();
		assertEquals(24, result);
	}
}


