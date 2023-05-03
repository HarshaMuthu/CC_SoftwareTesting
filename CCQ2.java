package ques2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CCQ2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.saucedemo.com/");
		driver.manage().window().maximize() ;
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		txtBoxl.sendKeys("standard_user");
		WebElement txtBox2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		txtBox2.sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		String txt1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println(txt1);
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
		String txt2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println(txt2);
		System.out.println("filter (A-Z and Z-A) used smoothly");
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		String txt3=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println(txt3);
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
		String txt4=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println(txt4);
		System.out.println("filter (low price- high price and high price - low price )used smoothly");

		
		Thread.sleep(5000);	
		
	}
	
}