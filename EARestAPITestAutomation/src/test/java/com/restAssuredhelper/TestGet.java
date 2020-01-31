package com.restAssuredhelper;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGet {

	@Test
	public void testGet() {

		String URI = "https://samples.openweathermap.org/data/2.5"
				+ "/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";

		Response response = RestAssured.get(URI);
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);

	}
	
	@Test
	public void testbody() {

		String URI = "https://samples.openweathermap.org/data/2.5"
				+ "/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
		
		String body = RestAssured.get(URI).asString();
		long time = RestAssured.get(URI).getTime();
		
		System.out.println(body);
		System.out.println(time);
	}

}
