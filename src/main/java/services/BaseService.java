package services;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract  class BaseService  extends Scenario {

    WebDriver driver;

    public BaseService(WebDriver driver) {
        this.driver = driver;
    }


    void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        }
        catch(Exception e) {

        }
        //driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

}
