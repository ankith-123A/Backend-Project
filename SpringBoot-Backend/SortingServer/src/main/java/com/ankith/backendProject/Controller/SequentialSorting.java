package com.ankith.backendProject.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class SequentialSorting implements SortingFunction 
{

	@Override
	public List<List<Integer>> sortArrays(List<List<Integer>> toSort) 
	{
		
		List<List<Integer>> sortedArrays = new ArrayList<>();
        for (List<Integer> array : toSort) {
            List<Integer> sortedArray = new ArrayList<>(array);
            sortedArray.sort(Integer::compareTo);
            sortedArrays.add(sortedArray);
        }
        return sortedArrays;
	}

}
