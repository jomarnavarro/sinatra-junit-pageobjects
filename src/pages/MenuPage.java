package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage {



    public WebElement encabezado;// "//h1"
    public WebElement homeLnk; // "//a[@title='Home']"
    public WebElement aboutLnk; // "//a[@title='About']"
    public WebElement contactLnk; // "//a[@title='Contact']"
    public WebElement songsLnk; // "//a[@title='Songs']"

    public MenuPage(WebDriver driverBaseTest) {
        super(driverBaseTest);
    }

    public void validateMenu(){

    }
    public void navigateSongs(){}
    public void navigateHome(){}
    public void navigateAbout(){}
    public void navigateContact(){}
}
