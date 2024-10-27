package Validate_the_Response_Request_day1;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class A2_Validating_putRequest_Response2 {
	

	public static void main(String[] args) {
		
//		GIVEN - WE WILL GIVE ALL THE INPUT DETAILS
//		WHEN - WE WILL SUBMIT THE API RESOURCE & HTTP METHOD
//		THEN - WE WILL VALIDATE THE RESPONSE
		
		RestAssured.baseURI="https://reqres.in/";
	String response =	given().log().all().header("Content-Type","application/json")
			.body("{\r\n"
					+ "    \"name\": \"Hari"
					+ "\",\r\n"
					+ "    \"job\": \"Engineer\"\r\n"
					+ "}")
		.when().log().all().put("api/users/2")
		.then().log().all().statusCode(200).extract().response().asString();
	System.out.println("----");
	System.out.println(response);
	JsonPath path = new JsonPath(response);
	String s = path.getString("page");
	String name = path.getString("id");
	System.out.println(name);
//	System.out.println(s);
	}

}
