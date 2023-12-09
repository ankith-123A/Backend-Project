package com.ankith.backendProject.Controller;

import java.util.List;

public class ResponsePayload 
{
	private List<List<Integer>> sortedArrays;
    private long timeNs;
	public List<List<Integer>> getSortedArrays() {
		return sortedArrays;
	}
	public void setSortedArrays(List<List<Integer>> sortedArrays) {
		this.sortedArrays = sortedArrays;
	}
	public long getTimeNs() {
		return timeNs;
	}
	public void setTimeNs(long timeNs) {
		this.timeNs = timeNs;
	}
	public ResponsePayload(List<List<Integer>> sortedArrays, long timeNs)
	{
        this.sortedArrays = sortedArrays;
        this.timeNs = timeNs;
    }
}
