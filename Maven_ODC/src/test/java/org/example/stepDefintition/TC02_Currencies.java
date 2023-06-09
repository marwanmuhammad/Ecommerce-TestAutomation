package org.example.stepDefintition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Currencies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.example.stepDefintition.Hooks.driver;

public class TC02_Currencies {

        P02_Currencies currency = new P02_Currencies();

@When("Select Euro currency from the dropdown list on the top left of home page")
    public void selectEuro(){
    WebElement dropDown = currency.dropList();
    Select select = new Select(dropDown);
    select.selectByVisibleText("Euro");
}
@Then("verify that Euro Symbol is shown on the 4 products displayed in Home page")
    public void verifySymbol(){

        for (int i = 1; i <= 4; i++) {
            WebElement product = driver.findElement(By.xpath("(//div[@class='product-item'])[" + i + "]//span[@class='price actual-price']"));
            String productPrice = product.getText();
            Assert.assertTrue(productPrice.contains("€"), "Product " + i + " does not display the Euro symbol");
    }

}



}

