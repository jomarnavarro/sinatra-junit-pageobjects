package tests.login;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class LoginSinatraTests extends BaseTest {



    @Test
    @FileParameters("./data/login.csv")
    public void testLoginExitoso(String user, String pass) {
        home.startLogin();
        login.ingresarCredencialesCorrectas(user, pass);
        home.validateWelcomeMessage(user);
    }

    @Test
    @FileParameters("./data/incorrect_login.csv")
    public void testNegativeLogin(String badUser, String badPass) {
        home.startLogin();
        login.ingresarCredencialesIncorrectas(badUser, badPass);
        login.validateErrorMessage();
    }



}
