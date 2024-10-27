package api_RestAssured_practice_day2;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given; 
//import static io.restassured.RestAssured.*;  both same 


public class Get_Request {

	public static void main(String[] args) {
//		https://reqres.in/api/users?page=2
//		GIVEN - WE WILL GIVE ALL THE INPUT DETAILS
//		WHEN - WE WILL SUBMIT THE API RESOURCE & HTTP METHOD
//		THEN - WE WILL VALIDATE THE RESPONSE
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().header("Content-Type","application/json").when().log().all().get("api/users?page=2")
		.then().log().all().statusCode(200);
	}

}
