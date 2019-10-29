package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver d) {
        this.driver = d;
    }
}
