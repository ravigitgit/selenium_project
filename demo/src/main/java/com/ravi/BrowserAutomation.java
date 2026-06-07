package com.ravi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserAutomation {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}