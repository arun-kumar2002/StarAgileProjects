package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ConfirmationPage {

    WebDriver driver;

    public ConfirmationPage(WebDriver driver) {

        this.driver = driver;
    }

    public void verifyBooking() {

        String pageText = driver.getPageSource();

        Assert.assertTrue(
                pageText.contains(
                        "Thank you for your purchase today!"
                ));
    }
}