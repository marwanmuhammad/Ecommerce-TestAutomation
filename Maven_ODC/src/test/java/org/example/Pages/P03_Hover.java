package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefintition.Hooks.driver;

public class P03_Hover {

public WebElement computers(){ return driver.findElement(By.xpath("//a[contains(text(),'Computers')]")); }
public WebElement desktop(){ return driver.findElement(By.xpath("//a[contains(text(),'Desktops')]")); }
public WebElement pageTitle(){ return driver.findElement(By.xpath("//div[@class=\"page-title\"]")); }



}
