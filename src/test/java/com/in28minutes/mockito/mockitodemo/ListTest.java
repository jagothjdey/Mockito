package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class ListTest {
	
	@Test
	public void testSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}
	
	@Test
	public void testSize_MultipleReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}
	
	@Test
	public void testGet_Specific() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("SomeString").thenReturn(20);
		assertEquals("SomeString", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void testGet_Generic() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		assertEquals("SomeString", listMock.get(1));
	}

}
