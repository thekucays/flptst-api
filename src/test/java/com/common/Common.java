package com.common;

import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import io.restassured.response.Response;

public class Common {
	public static void getGenderResponse(String name, String expected) {
		final String genderURL = "https://api.genderize.io/?name=" + name;
		Response apiResponse = get(genderURL);
		
		// assert things 
		Assert.assertEquals(apiResponse.getStatusCode(), 200);
		given().get(genderURL)
			.then().statusCode(200)
			.and().body("gender", equalTo(expected))
			.and().assertThat().body(matchesJsonSchemaInClasspath("genderSchema.json"));
	}
}
