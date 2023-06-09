package org.example.stepDefintition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P00_Register;
import org.testng.Assert;

public class TC00_Register {
P00_Register registerr = new P00_Register();

@And("go to register page")
    public void register_Page() { registerr.registerPage().click(); }
@When("enter the mandatory data")
    public void enterData() {
registerr.firstName().sendKeys("marwan");
registerr.lastName().sendKeys("mohamed");
registerr.email().sendKeys("marwan2@gmail.com");
registerr.password().sendKeys("123456");
registerr.confirmPassword().sendKeys("123456");
}
@And("click on register button")
    public void clickBtn() {
registerr.clickRegisterBtn().click();
}
@Then("success message is displayed")
    public void successMsg() {
    String expected = "Your registration completed";
    String actual = registerr.txtMsg().getText();
    Assert.assertTrue(actual.contains(expected));
}



}
