package org.example.stepDefintition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_login;
import org.testng.Assert;

import static org.example.stepDefintition.Hooks.driver;

public class TC01_login {
    P01_login loginn = new P01_login();
    //SoftAssert softAssert = new SoftAssert();

@Given("navigate to url website")
public void urlWebsite(){ driver.navigate().to("https://demo.nopcommerce.com/");

}
@And("Go to login page")
    public void login(){
    driver.navigate().to("https://demo.nopcommerce.com/login");
}
@When("Enter valid email and password")
    public void validData(){
    loginn.mail().sendKeys("marwan@gmail.com");
    loginn.pass().sendKeys("123456");

}
@And("click on login button")
    public void loginButton(){
    loginn.lgnBtn().click();
}
@Then("verify that user logged in successfully")
    public void successLogin(){
boolean logout_btn = loginn.lgoutBtn().isDisplayed();
    Assert.assertTrue(logout_btn);

}

@When("Enter invalid email and password")
    public void invalidData(){
    loginn.mail().sendKeys("test@gmail.com");
    loginn.pass().sendKeys("Mohamed");
    loginn.lgnBtn().click();

}
@Then("verify that user didn't log in successfully")
    public void notLogged(){
boolean error_msg = loginn.errmsg().isDisplayed();
    Assert.assertTrue(error_msg);
}


}
