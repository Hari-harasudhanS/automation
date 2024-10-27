package com.specBuilder;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_Builder {
	public static void main(String[] args) {
//		https://reqres.in/api/users?page=2
//		GIVEN - WE WILL GIVE ALL THE INPUT DETAILS
//		WHEN - WE WILL SUBMIT THE API RESOURCE & HTTP METHOD
//		THEN - WE WILL VALIDATE THE RESPONSE
		RestAssured.baseURI="https://reqres.in/";
		// simplifying the similar path are saving it has {{}}====> concept
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://reqres.in/").addHeader("Content-Type","application/json").setContentType(ContentType.JSON).build();
		
		ResponseSpecification statucode200 = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		ResponseSpecification statucode201 = new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
		
		RequestSpecification getting=	given().spec(req);	
		
		String asString = getting.when().log().all().get("api/users?page=2")   
		.then().log().all().assertThat().spec(statucode200).extract().response().asString();
	}

}

