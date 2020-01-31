package com.restAssuredhelper;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Delete_PutExample {
	
	@Test
	public void test() {
		RequestSpecification request = RestAssured.given();
		
		request.headers("Content-Type","application/json");
		
		JSONObject json = new JSONObject();
		json.put("id", "21");
		json.put("title", "Selenium API");
		json.put("author", "Harish");
		
		request.body(json.toJSONString());
		
		Response response = request.post("http://localhost:3000/posts/");
		
		int statscode = response.getStatusCode();
		
		Assert.assertEquals(statscode, 201);
		
	}

}
