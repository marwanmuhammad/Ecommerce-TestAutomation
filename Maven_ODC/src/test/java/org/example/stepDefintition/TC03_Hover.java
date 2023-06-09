package org.example.stepDefintition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_Hover;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.stepDefintition.Hooks.driver;

public class TC03_Hover {
P03_Hover hover = new P03_Hover();

@When("hover on computers item")
public void move(){

    WebElement computersMenuItem = hover.computers();
    Actions actions = new Actions(driver);
    actions.moveToElement(computersMenuItem).perform();

}
@And("click on desktops subitem")
public void click(){

    WebElement desktopsSubcategory = hover.desktop();
    desktopsSubcategory.click();



}
@Then("verify that the page title contains \"Desktops\"")
public void verify(){
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    String title = hover.pageTitle().getText();
    Assert.assertTrue(title.toLowerCase().trim().contains("desktops"));

}



}
