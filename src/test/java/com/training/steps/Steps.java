package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;
	@Given("user is on tekarch application")
	public void user_is_on_tekarch_application() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://selenium-prd.firebaseapp.com/");
	}
	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
	}
	@When("user enter the valid password")
	public void user_enter_the_valid_password() {
		
		driver.findElement(By.id("password_field")).sendKeys("admin123");
	}
	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	   
	}
	@Then("click home")
	public void click_home() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}
}
