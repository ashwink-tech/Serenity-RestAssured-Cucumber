package com.studentapp.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class TestBase {

	@BeforeClass
	public static void initializeCrudTest() {
		
		RestAssured.baseURI="http://localhost:8090/student";
		
	}
	
}
