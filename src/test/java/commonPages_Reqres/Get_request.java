package commonPages_Reqres;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Get_request {
	static RequestSpecification header ;
	
	static Response response;
	public static void baseUrl(String Baseurl) {
		RestAssured.baseURI = Baseurl;

	}
public static void headerContent(String Content, String Type) {
	 header = given().log().all().header(Content,Type);
	
}
public static void resource(String res) {
	 response = header.when().log().all().get(res);
	
}
public static void status(Integer code) {
	ResponseSpecification statucode200 = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	response.then().log().all().assertThat().spec(statucode200).extract().response().asString();
}
}
