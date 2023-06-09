package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefintition.Hooks.driver;

public class P04_Search {

    public WebElement searchBar() { return driver.findElement(By.xpath("//input[@type=\"text\"]")); }

    public List<WebElement> productItem() { return driver.findElements(By.className("product-item")); }

    public WebElement clickItem() { return driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000024_apple-macbook-pro-13-inch_415.jpeg\"]")); }

    public WebElement actualSerial(){ return driver.findElement(By.xpath("//span[@id=\"sku-4\"]")); }
}
