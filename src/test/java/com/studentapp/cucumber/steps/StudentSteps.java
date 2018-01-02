package com.studentapp.cucumber.steps;

import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class StudentSteps {
	
	
	@When("^User sends a valid request to list endpoint, it must receive (\\d+) status code$")
	public void user_sends_a_valid_request_to_list_endpoint_it_must_receive_status_code(int statuscode)  {

      SerenityRest.rest()
      .given()
      .when()
      .get("/list")
      .then()
      .statusCode(statuscode);
		
	}
	

}
