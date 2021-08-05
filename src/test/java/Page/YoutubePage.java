package Page;

import Default.BaseClass;
import org.openqa.selenium.WebDriver;

public class YoutubePage {

               //YoutubePage(){       }

        public void enterWebsite(){

             BaseClass.getDriver();
             BaseClass.getDriver().get("https://www.youtube.com/");

        }


}
