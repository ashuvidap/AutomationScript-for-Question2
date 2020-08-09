package com.JabaTalks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class TC_SignUp {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");

	 String baseURL = "http://jt-dev.azurewebsites.net/#/SignUp"; //URL of website
	 WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(baseURL);
	//Dropdown verification
	String[] exp = {"English","Dutch"};
 	WebElement dropdown = driver.findElement(By.xpath("//*[@id="language"]/div[1]/span/span[2]"));  
	 Select select = new Select(dropdown);  

	 List<WebElement> options = select.getOptions();  
	 for(WebElement we:options)  
 	{  
  	boolean match = false;
  	for (int i=0; i<exp.length(); i++){
      	if (we.getText().equals(exp[i]){
       	 match = true;
     	 		}
    		}
  	Assert.assertTrue(match);
	 System.out.println("Language Dropdown values are verified");  

 		}  
	
	driver.findElement(By.id("name")).sendKeys("Priya"); 
	driver.findElement(By.id("orgName")).sendKeys("Priya"); 
	driver.findElement(By.id("singUpEmail")).sendKeys("ashu.vidap@gmail.com"); 
	driver.findElement(By.xpath("//*[@id="content"]/div/div[3]/div/section/div[1]/form/fieldset/div[4]/label/span")).click();
	driver.findElement(By.xpath("//*[@id="content"]/div/div[3]/div/section/div[1]/form/fieldset/div[5]/button")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	//Email verification
	if(driver.findElement(By.xpath("//span[contains(text(),'welcome email has been sent')]")).isDisplayed())
	{
		 System.out.println("Email sent is verified");  
	}
	else{
		System.out.println("Email verification has been failed"); 
		}
	
	}

}
