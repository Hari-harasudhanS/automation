package Validate_the_Response_Request_day1;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class A1_forloop_Validating_getRequest_Response {
	

	public static void main(String[] args) {
		
//		GIVEN - WE WILL GIVE ALL THE INPUT DETAILS
//		WHEN - WE WILL SUBMIT THE API RESOURCE & HTTP METHOD
//		THEN - WE WILL VALIDATE THE RESPONSE
		
		RestAssured.baseURI="https://reqres.in/";
	String response =	given().log().all().header("Content-Type","application/json")
		.when().log().all().get("api/users?page=2")
		.then().log().all().statusCode(200).extract().response().asString();
	System.out.println("----");
	System.out.println(response);
	JsonPath path = new JsonPath(response);
	int s = path.getInt("data.id.size()");
//	String s = path.getString("url");
	System.out.println(s);
	
	for (int i = 0; i < s; i++) {
		
		String name = path.getString("data["+i+"].first_name");
		System.out.println(name);
		if (name.equals("George")) {
			System.out.println("is present");
			break;
			
		}
		
	}
	}

}
