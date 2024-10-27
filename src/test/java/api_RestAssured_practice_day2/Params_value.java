package api_RestAssured_practice_day2;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Params_value {

	public static void main(String[] args) {
		
//		GIVEN - WE WILL GIVE ALL THE INPUT DETAILS
//		WHEN - WE WILL SUBMIT THE API RESOURCE & HTTP METHOD
//		THEN - WE WILL VALIDATE THE RESPONSE
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().header("Content-Type","application/json")
		.param("page", "2") // create key and value in param
		.when().log().all().get("api/users")  //dont need to add 2 here after that
		.then().log().all().statusCode(200);
	}

}
