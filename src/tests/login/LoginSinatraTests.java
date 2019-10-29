package tests.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;

public class LoginSinatraTests extends BaseTest {



    @Test
    public void testLoginExitoso() {
        home.startLogin();
        login.ingresarCredencialesCorrectas("frank", "sinatra");
        home.validateWelcomeMessage("frank");


    }

    @Test
    public void testNegativeLogin() {
        home.startLogin();
        login.ingresarCredencialesIncorrectas("frenk", "sinotra");
        login.validateErrorMessage();
    }



}
