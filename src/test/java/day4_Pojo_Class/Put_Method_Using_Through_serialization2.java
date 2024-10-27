package day4_Pojo_Class;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;

public class Put_Method_Using_Through_serialization2 {
	public static void main (String[]args) throws JsonProcessingException {
		Getter_Setter gs = new Getter_Setter();
		gs.setName("gokul");
		gs.setJob("It");
		System.out.println(gs.getName());
		System.out.println(gs.getJob());
		
		ObjectMapper m =new ObjectMapper();
		String value = m.writerWithDefaultPrettyPrinter().writeValueAsString(gs);
		System.out.println(value);
		
	
		
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().header("Content-Type","application/json")
		.body(value)
		.when().log().all().put("api/users/2")
		.then().log().all().statusCode(200);
		
	}
	

}
//https://reqres.in/api/users/2