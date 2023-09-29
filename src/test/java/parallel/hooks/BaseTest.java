package parallel.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

    protected static WebDriver driver;


    //RUN
    //Clean AllTest -Dwebdriver.chrome.driver="D:\AppDemo\src\test\resources\driver\chromedriver.exe" --project-prop includeTags="Test"

    @Before
    public void init(){
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("url");
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @After
    public void close(){
        driver.close();
    }

}
