package com.in28minutes.mockito.mockitodemo;

public class BusinessService {
	
	private DataService dataService;
	
	public BusinessService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		int res = Integer.MIN_VALUE;
		int[] data = dataService.getData();
		for(int i : data) {
			res = Math.max(res, i);
		}
		return res;
	}   
}


