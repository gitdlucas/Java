package com.thecat.TesteApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testando {
public static void main(String[] args) {

	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.google.com.br");
	
	WebElement vartxt = driver.findElement(By.name("q"));

	vartxt.sendKeys("Ministério Público da Paraíba");
	
	vartxt.submit();
}
} 
