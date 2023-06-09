package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefintition.Hooks.driver;

public class P00_Register {

public WebElement registerPage(){ return driver.findElement(By.xpath("//a[@class=\"ico-register\"]")); }
public WebElement firstName(){ return driver.findElement(By.xpath("//input[@id=\"FirstName\"]")); }
public WebElement lastName(){ return driver.findElement(By.xpath("//input[@id=\"LastName\"]")); }
public WebElement email(){ return driver.findElement(By.xpath("//input[@id=\"Email\"]")); }
public WebElement password(){ return driver.findElement(By.xpath("//input[@id=\"Password\"]")); }
public WebElement confirmPassword(){ return driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")); }
public WebElement clickRegisterBtn(){ return driver.findElement(By.xpath("//button[@id=\"register-button\"]")); }
public WebElement txtMsg(){ return driver.findElement(By.xpath("//div[@class=\"result\"]")); }




}
