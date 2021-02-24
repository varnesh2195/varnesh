package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARNESH\\eclipse-workspace\\sandoline\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		
		List<WebElement> tables = driver.findElements(By.tagName("table"));
		System.out.println("tables count...."+tables.size());
		
		
		WebElement table = driver.findElement(By.id("customers"));
	//get rows	
	List<WebElement> trows = table.findElements(By.tagName("tr"));
	System.out.println("****only rows****");
	for (int i = 0; i < trows.size(); i++) {
		WebElement eachrow = trows.get(i);
		String rtext = eachrow.getText();
		System.out.println(rtext);
		
	}
		
		//headings
	System.out.println("****only headings****");
	for (WebElement eachrow : trows) {
		List<WebElement> theads = eachrow.findElements(By.tagName("th"));
		for (WebElement eachhead : theads) {
			String htext = eachhead.getText();
			System.out.println(htext);
			
		}
		
	}

}
}