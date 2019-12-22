package ru.test.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class DriverConfig {

    @Bean
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
