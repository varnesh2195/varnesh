package org.login;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class fb {
	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARNESH\\eclipse-workspace\\sandoline\\driver\\chromedriver.exe");
			
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       WebElement e = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
	       e.click();
	       WebElement sc = driver.findElement(By.xpath("//input [@class=\"_3704LK\"]"));
	       sc.sendKeys("iphone");
	       WebElement c = driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]"));
	       c.click();
	  List<WebElement> iphone = driver.findElements(By.xpath("//a[@class=\"s1Q9rs\"]"));
	 List<WebElement> price = driver.findElements(By.xpath("//div[@class=\"_30jeq3\"]"));
	 
	 for (int i = 0; i < iphone .size(); i++) {
		 String txt = iphone.get(i).getAttribute("title");
		 String prc = price.get(i).getText().substring(1);
		 System.out.println(txt);
		 System.out.println(prc);
		 
		 
		
	}
	 System.out.println("price in asscending order");
	List<String> li = new ArrayList<>();
	for (int i = 0; i < price.size(); i++) {
		String aa = price.get(i).getText().substring(1);
		li.add(aa.replace(",", ""));
		
		
	}
	Collections.sort(li);
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
		
	}
	 
	 
	}	       

}
