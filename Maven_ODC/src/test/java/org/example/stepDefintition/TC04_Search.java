package org.example.stepDefintition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_Search;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefintition.Hooks.driver;

public class TC04_Search {
    P04_Search searchPage = new P04_Search();

@When("user search using different product names {string}")
    public void searchItems(String product){
    searchPage.searchBar().sendKeys(product);
    searchPage.searchBar().sendKeys(Keys.ENTER);


}
@Then("verify that search url changed and number of {string} changed")
    public void verifyResults(String product) {
    //verify that the number of products
    List<WebElement> searchResults = searchPage.productItem();
    int numberOfResults = searchResults.size();
    System.out.println(numberOfResults);
    //verify that url changes by search
    String expectedUrl = "https://demo.nopcommerce.com/search?q=" + (product);
    String actualUrl = driver.getCurrentUrl();
    Assert.assertTrue(actualUrl.contains(expectedUrl));
}
@When("user enter serial number in the search bar")
    public void serialNo(){ searchPage.searchBar().sendKeys("AP_MBP_13"); searchPage.searchBar().sendKeys(Keys.ENTER); }
@And("open the product appeared after his search")
    public void openItem(){
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    searchPage.clickItem().click();
}
@Then("verify that the product contains the serial number")
    public void verifySerial(){

    String expected = "AP_MBP_13";
    String actual = searchPage.actualSerial().getText();
    Assert.assertTrue(actual.contains(expected));

}


}
