package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefintition.Hooks.driver;

public class P01_login {

public WebElement mail() { return driver.findElement(By.cssSelector("input[class=\"email\"]")); }
public WebElement pass() { return driver.findElement(By.cssSelector("input[class=\"password\"]")); }
public WebElement lgnBtn() { return driver.findElement(By.className("login-button")); }
public WebElement lgoutBtn() { return driver.findElement(By.xpath("//a[@href=\"/logout\"]")); }
public WebElement errmsg() { return driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")); }




}
