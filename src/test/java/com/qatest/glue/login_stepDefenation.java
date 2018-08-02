package com.qatest.glue;


import com.qatest.framework.ParentScenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_stepDefenation extends ParentScenario {
	
	@Before
	public void beforeScenario() throws Throwable {
		startBrowser();
	}
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    login.navigateto();
	}

	@When("^User enter Password \"([^\"]*)\"$")
	public void user_enter_Password(String arg1) throws Throwable {
	   login.enterPassword(arg1);
	}

	@When("^User Click LogIn button$")
	public void user_Click_LogIn_button() throws Throwable {
	    login.clickLoginbtn();
	}

	@Then("^User check login alert \"([^\"]*)\"$")
	public void user_check_login_alert(String arg1) throws Throwable {
	    login.alertCheck(arg1);
	}

	

}
