package com.restAssuredhelper;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredDemo {
	
	@BeforeMethod
	public void setUp() {
		RestAssured.authentication = RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		
	}
	
	@Test
	public void test1() {
		System.out.println(RestAssured.given()
				.when()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
				.getStatusCode());
	}

}
