package Deserialization;

import static io.restassured.RestAssured.given;

import java.util.Iterator;

import io.restassured.RestAssured;

public class Method_using_deserilisation {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		
		Getter_Setter value = given().log().all().header("Content-Type","application/json")
		.when().log().all().get("api/users?page=2")  //Here in this we captured the json value
		.as(Getter_Setter.class);
		
		System.out.println(value.getPage());
		System.out.println(value.getData().get(1).getFirst_name());
		System.out.println(value.getSupport().getUrl());
		
		System.out.println(value.getData().size());
			
		for(int i=0; i<value.getData().size(); i++) {
			System.out.println(value.getData().get(i).getFirst_name());
		}
	}

}

