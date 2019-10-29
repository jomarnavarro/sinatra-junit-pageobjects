package tests.login;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;

public class BaseTest {
    WebDriver driver;
    HomePage home;
    LoginPage login;
    MenuPage menu;
    String url = "https://songs-by-sinatra.herokuapp.com";

    String usernameCorrecto = "frank";
    String passwordCorrecto = "sinatra";
    //3 metodos de JUnit
    @Before
    public void setUp() {
        //arracar el browser
        driver = new ChromeDriver();
        //navegar  a la pagina
        driver.get(url);
        home = new HomePage(driver);
        login = new LoginPage(driver);
        menu = new MenuPage(driver);
    }

    public void verificarHomePage() {
    }

    public void ingresarPagina(String usernameCorrecto, String passwordCorrecto) {
    }

    public void verificarMensajeBienvenida(String usernameCorrecto) {
    }

    @After
    public void comoQuieranLlamarle() {
        driver.quit();
    }

}
