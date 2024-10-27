package day4_Pojo_Class;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;

public class Post_Method_Using_Through_serialization {
	public static void main (String[]args) throws JsonProcessingException {
		Getter_Setter gs = new Getter_Setter();
		gs.setName("hari");
		gs.setJob("Eng");
		System.out.println(gs.getName());
		System.out.println(gs.getJob());
		
		ObjectMapper m =new ObjectMapper();
		String value = m.writerWithDefaultPrettyPrinter().writeValueAsString(gs);
		System.out.println(value);
		
	
		
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().header("Content-Type","application/json")
		.body(value)
		.when().log().all().post("api/users")
		.then().log().all().statusCode(201);
		
	}
	

}
