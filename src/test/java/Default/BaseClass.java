package Default;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    private static WebDriver driver;

    @Before
    public void startTest(Scenario scenario) {
        //System.setProperty("webdriver.chrome.driver","C://Users//6F83-VUTKR//IdeaProjects//BDDJava//Utility//driver//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.get("http://google.com");
    }

    @After
    public void tearDown(Scenario scenario) {
        //Helper.screenshot(scenario);
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
