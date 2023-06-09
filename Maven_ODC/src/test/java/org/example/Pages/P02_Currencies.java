package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefintition.Hooks.driver;

public class P02_Currencies {

public WebElement dropList(){ return driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]")); }


}
