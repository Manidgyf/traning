package com.probsol;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFunc {
	public static Map<String,Long> mfcount(List<Employee> ls)
	{
		Map<String, Long> mf = ls.stream().collect(Collectors.groupingBy(s->s.getGender(),Collectors.counting()));
		return mf;
	}
	

}
