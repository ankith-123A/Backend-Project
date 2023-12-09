package com.ankith.backendProject.Controller;

import java.util.List;

public class RequestPayload 
{
	 private List<List<Integer>> toSort;

	public List<List<Integer>> getToSort() 
	{
		return toSort;
	}

	public void setToSort(List<List<Integer>> toSort) 
	{
		this.toSort = toSort;
	}
	 
}
