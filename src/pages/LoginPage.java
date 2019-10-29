package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{


   public WebElement userNameTxt; // id =username
    public WebElement passwordTxt ;// id = password
    public WebElement loginBtn ;// xpath = //input[@type = 'submit']
    public WebElement loginLnk; //xpath = //a[@href= '/login']

    public LoginPage(WebDriver driverBaseTest) {
        super(driverBaseTest);
    }

    public void validateLoginPage(){

    }
    public void startLogin(){

    }
    public void ingresarCredencialesCorrectas(String user,String pass){

        userNameTxt = driver.findElement(By.id("username"));
        passwordTxt= driver.findElement(By.id("password"));
        loginBtn = driver.findElement(By.xpath("//input[@type = 'submit']"));

        userNameTxt.sendKeys(user);
        passwordTxt.sendKeys(pass);
        loginBtn.click();

    }
    public void ingresarCredencialesIncorrectas(String incorrectUser, String incorrectPassword){}

    public void validateErrorMessage() {
    }
}
