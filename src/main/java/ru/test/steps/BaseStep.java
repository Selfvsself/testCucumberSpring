package ru.test.steps;

import io.cucumber.java.ru.Когда;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class BaseStep {

    WebDriver driver;

    @Autowired
    public BaseStep(WebDriver driver) {
        this.driver = driver;
    }

    @Value("${app.url}")
    private String url;

    @Когда("тест")
    public void test() {
        driver.get(url);
    }
}
