package com.studentapp.utils;

import java.util.Random;

public class TestUtils {
		
	public static String getRandomValue ()  {
		
		Random rand = new Random();
		int value =rand.nextInt(100000);
		return Integer.toString(value);
		
	}
}
