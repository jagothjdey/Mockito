package com.in28minutes.mockito.mockitodemo;

public class DataServiceStub implements DataService {

	@Override
	public int[] getData() {
		return new int[] {24,56,68};
	}

}
