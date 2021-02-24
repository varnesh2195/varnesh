package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D3and3rdq {
	//public static void main(String[] args) {
		public static void main(String[] args) throws AWTException, InterruptedException {
		     System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARNESH\\eclipse-workspace\\sandoline\\driver\\chromedriver.exe");
				
		       WebDriver driver = new ChromeDriver();
		       driver.get("http://demo.automationtesting.in/Register.html");
		       driver.manage().window().maximize();
		       
		       WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		       firstname.sendKeys("ashwin");
		       WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		       lastname.sendKeys("jayaseelan");
		      WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		       address.sendKeys("B-27 umbrella st bl-3 neyveli_607801");
		       WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		       email.sendKeys("ashwineee04@gmail.com");
		       WebElement phno = driver.findElement(By.xpath("//input[@type='tel']"));
		       phno.sendKeys("9751102233");
		       WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		       gender.click();
		       WebElement cricket = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		       cricket.click();
		   
		       WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
		       lang.click();
		       WebElement english = driver.findElement(By.xpath("(//a[@style='text-decoration:none'])[8]"));
		       english.click();
		       WebElement movies = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		       movies.click();
		       WebElement skill = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		       skill.click();
		       //robot class for skill
		       Robot r = new Robot();
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       

		       r.keyPress(KeyEvent.VK_ENTER);
		       r.keyRelease(KeyEvent.VK_ENTER);
		       
		       WebElement country = driver.findElement(By.xpath("(//select[@type='text'])[2]"));
		       country.click();
		       
		       //Robot class for country by index
		       Select cn = new Select(country);
		       cn.selectByIndex(105);
		     
		      
		       WebElement selectcon = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
		       selectcon.click();
		       
		       //Robot class for country select
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       
		       r.keyPress(KeyEvent.VK_ENTER);
		       r.keyRelease(KeyEvent.VK_ENTER);
		                  
		       WebElement year = driver.findElement(By.id("yearbox"));
		       year.click();
		       Select yr = new Select(year);       
		       yr.selectByIndex(79);
		       
		       WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		       month.click();
		       Select mn = new Select(month);
		       mn.selectByIndex(7);
		       
		       WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		       day.click();
		       Select dy = new Select(day);
		       dy.selectByIndex(13);
		       
		       WebElement pass = driver.findElement(By.id("firstpassword"));
		       pass.sendKeys("Ashwin04");
		       WebElement secpass = driver.findElement(By.id("secondpassword"));
		       secpass.sendKeys("Ashwin04");
		       
		       WebElement submit = driver.findElement(By.id("submitbtn"));
		       submit.click();
		       Thread.sleep(5000);
		       driver.close();
		       
		          }




	}


