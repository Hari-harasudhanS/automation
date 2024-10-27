package parametrization_day3;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class A3_Adding_payload_through_json_file {
	@Test

	public static void Json_payload() throws IOException {
		RestAssured.baseURI="https://reqres.in/";
		
		given().log().all().header("Content-Type","application/json")
		.body(new String (Files.readAllBytes(Paths.get(".\\src\\test\\java\\parametrization_day3\\sample1.json"))))
		.when().log().all().post("api/users")
		.then().log().all().statusCode(201);
	}

}
