package com.satya.Lambdas_and_Streams;

import java.util.*;
public class Average {
	public double avg(List<Integer> list)
	{
		return list.stream().mapToInt(number -> number.intValue()).average().getAsDouble();
	}
}

