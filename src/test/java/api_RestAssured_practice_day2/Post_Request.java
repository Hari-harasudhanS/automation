package api_RestAssured_practice_day2;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Post_Request {

	public static void main(String[] args) {
		
//		GIVEN - WE WILL GIVE ALL THE INPUT DETAILS
//		WHEN - WE WILL SUBMIT THE API RESOURCE & HTTP METHOD
//		THEN - WE WILL VALIDATE THE RESPONSE
		
		
		
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.when().log().all().post("api/users")
		.then().log().all().statusCode(201);
	}


}
