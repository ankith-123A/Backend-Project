package com.ankith.backendProject.Controller;
import com.google.gson.Gson;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sorting")
public class SortingController
{
	private final Gson gson = new Gson();

    @PostMapping("/process-single")
    public String processSingle(@RequestBody RequestPayload requestPayload) {
        return process(requestPayload, new SequentialSorting());
    }

    @PostMapping("/process-concurrent")
    public String processConcurrent(@RequestBody RequestPayload requestPayload) {
        return process(requestPayload, new ConcurrentSorting());
    }

    private String process(RequestPayload requestPayload, SortingFunction sortingFunction) {
        try {
            long startTime = System.nanoTime();
            List<List<Integer>> sortedArrays = sortingFunction.sortArrays(requestPayload.getToSort());
            long elapsedTime = System.nanoTime() - startTime;

            ResponsePayload responsePayload = new ResponsePayload(sortedArrays, elapsedTime);
            return gson.toJson(responsePayload);
        } catch (Exception e) {
            return "Invalid JSON payload";
        }
    }
}
