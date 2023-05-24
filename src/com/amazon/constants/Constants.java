package com.amazon.constants;

import java.io.File;

public class Constants {

	static String USER_HOME = System.getProperty("user.dir");
	static String TESTDATA_HOME = USER_HOME+File.separator+"Data";
	
	static String testDataFile = TESTDATA_HOME+"testData.txt";

	public static void main(String[] args) {
		System.out.println(testDataFile);

	}

}
