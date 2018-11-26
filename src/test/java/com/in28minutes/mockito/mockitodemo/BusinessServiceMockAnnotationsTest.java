package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class BusinessServiceMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	BusinessService businessService;
	
	@Test
	public void testfindMax() {
		when(dataServiceMock.getData()).thenReturn(new int[] {24,56,68});
		assertEquals(68, businessService.findMax());
	}
	
	@Test
	public void testfindMax_ForOneValue() {
		when(dataServiceMock.getData()).thenReturn(new int[] {24});
		assertEquals(24, businessService.findMax());
	}
	
	@Test
	public void testfindMax_NoValue() {
		when(dataServiceMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessService.findMax());
	}
}


