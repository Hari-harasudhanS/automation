package com.reqres.stepdef;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import commonPages_Reqres.Get_request;
import io.cucumber.java.en.*;

public class Test_Def {
									//https://reqres.in
@Given("The user enter the base URL {string}")
public void the_user_enter_the_base_url(String Url) {
	Get_request.baseUrl(Url);
	
}

@Given("User added the header content {string} and {string}")
public void user_added_the_header_content_and(String Content, String Type) {
	Get_request.headerContent(Content, Type);
	
}

@Given("User added the Get resource {string}")
public void user_added_the_get_resource(String res) {
	Get_request.resource(res);
}

@Given("the API call got sucess with status code {int}")
public void the_api_call_got_sucess_with_status_code(Integer code) {
	Get_request.status(code);
}

}
