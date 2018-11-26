package com.in28minutes.mockito.mockitodemo;

class DataServiceStub implements DataService{

	@Override
	public int[] getData() {
		return new int[] {12,45,67,12};
	}
	
}