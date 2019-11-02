package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public WebElement welcomeTxt; //xpath: "//p"

    public WebElement sinatraImg; //xpath: "//img"

    public WebElement loginLnk; //xpath: "//a[contains(text(), 'log')]"

    @FindBy(id = "flash")
    public WebElement welcomeLbl; //id = "flash"

    public HomePage(WebDriver driverBaseTest) {
        super(driverBaseTest);
    }

    public void validateHomePage() {

    }

    public void startLogin() {
        loginLnk = driver.findElement(By.xpath("//a[contains(text(), 'log')]"));
        loginLnk.click();
    }

    public void validateWelcomeMessage(String user) {
        welcomeLbl = driver.findElement(By.id("flash"));
        String welcomeMessage = welcomeLbl.getText();
        Assert.assertTrue("The username is incorrect", welcomeMessage.contains(user));

    }
}
