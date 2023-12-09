package com.ankith.backendProject.Controller;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentSorting  implements SortingFunction
{
 
	@Override
	public List<List<Integer>> sortArrays(List<List<Integer>> toSort)
	{
		
		 int parallelism = Math.min(Runtime.getRuntime().availableProcessors(), toSort.size());

         return toSort.parallelStream()
                 .map(array -> {
                     List<Integer> sortedArray = new ArrayList<>(array);
                     sortedArray.sort(Integer::compareTo);
                     return sortedArray;
                 })
                 .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
     }
}


