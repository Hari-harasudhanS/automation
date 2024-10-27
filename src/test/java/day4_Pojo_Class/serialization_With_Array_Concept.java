package day4_Pojo_Class;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;

public class serialization_With_Array_Concept {
	public static void main (String[]args) throws JsonProcessingException {
		Getter_Setter gs = new Getter_Setter();
		gs.setName("gokul");
		gs.setJob("It");
		gs.setSkill(Arrays.asList("Java","Selenium","api","Cuccumber"));
		System.out.println(gs.getName());
		System.out.println(gs.getJob());
		
		ObjectMapper m =new ObjectMapper();
		String value = m.writerWithDefaultPrettyPrinter().writeValueAsString(gs);
		System.out.println(value);
		
	
	}
	

}
//https://reqres.in/api/users/2