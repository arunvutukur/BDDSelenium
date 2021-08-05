package stepdefinitions;

import Default.BaseClass;
import Page.YoutubePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubesearchsteps extends YoutubePage {


    //WebDriver driver;




    @Given("^Login to youtube$")
    public void launchBrowser() throws InterruptedException {

    //System.setProperty("webdriver.chrome.driver","C://Users//6F83-VUTKR//IdeaProjects//BDDJava//Utility//driver//chromedriver.exe");
    //driver =new ChromeDriver();
        System.out.println("launching the browser");
    Thread.sleep(10000);
    }

    @Given("^I open homepage$")
    public void OpenHomepage(){

        //driver.get("https://www.youtube.com/");
        //BaseClass.getDriver().get("https://www.youtube.com/");
        enterWebsite(); //->Null pointer execption

    }

    @Given("^I verify the page displayed$")
    public void PageIsDisplayed() throws InterruptedException {

        Thread.sleep(10000);
    }

    @Given("^Close the browser$")
    public void TeardownPage() throws InterruptedException {

        Thread.sleep(10000);
        //driver.close();
        System.out.println("tear down done");
    }

}



