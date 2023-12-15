package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class Sample11 {
    public static void main(String[] args) {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
    }
}



