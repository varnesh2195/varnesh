package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARNESH\\eclipse-workspace\\sandoline\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.184696431.737193983.1611301807-1847497472.1611301807");
		driver.switchTo().frame("login_page");
		WebElement user = driver.findElement(By.name("fldLoginUserId"));
		user.sendKeys("varnun");
		WebElement conbt = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		conbt.click();
		WebElement pass = driver.findElement(By.name("fldPassword"));
		pass.sendKeys("1234");
		
	}

}
