package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		Scanner scn = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\April2021_Selenium\\First_Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); //concept of polymorphism
		
		driver.get("https://www.selenium.dev/"); //to open any website on chrome browser
		driver.manage().window().maximize(); // to maximize the window with the website
		
		
		Thread.sleep(2000);// keep the window open for 2000milliseconds
		
		driver.close();// to close the browser
	}
	
}
