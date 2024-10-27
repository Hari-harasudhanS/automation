package Validate_the_Response_Request_day1;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class A3_Post_ReturnType_value {

	public static void main(String[] args) {
//		GIVEN - WE WILL GIVE ALL THE INPUT DETAILS
//		WHEN - WE WILL SUBMIT THE API RESOURCE & HTTP METHOD
//		THEN - WE WILL VALIDATE THE RESPONSE
		
		
		
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().header("Content-Type","application/json")
		.body(common_Payload.postBody())
		.when().log().all().post("api/users")
		.then().log().all().statusCode(201);

	}

}
